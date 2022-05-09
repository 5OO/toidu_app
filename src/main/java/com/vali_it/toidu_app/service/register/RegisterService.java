package com.vali_it.toidu_app.service.register;

import com.vali_it.toidu_app.domain.users.contact.Contact;
import com.vali_it.toidu_app.domain.users.contact.ContactMapper;
import com.vali_it.toidu_app.domain.users.contact.ContactRepository;
import com.vali_it.toidu_app.domain.users.contact.ContactService;
import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserMapper;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import com.vali_it.toidu_app.domain.users.user.UserService;
import com.vali_it.toidu_app.service.profile.ContactDto;
import com.vali_it.toidu_app.service.profile.UserIdDto;
import com.vali_it.toidu_app.service.userprofile.UserProfileService;
import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class RegisterService {
    @Resource
    private UserService userService;

    @Resource
    private UserProfileService userProfileService;

    @Resource
    private ContactService contactService;

    @Resource
    private ContactRepository contactRepository;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    @Resource
    private ContactMapper contactMapper;


    public RegisterResponse registerNewCustomer(RegisterRequest request) {
        User user = userService.addNewUser(request);
        contactService.addNewContact(user, request);
        return new RegisterResponse(user.getId());
    }


    public RegisterRequest findUserInfoById(Integer id) {

        // TODO: 09.05.2022 valideerimine
        UserIdDto userIdDto = new UserIdDto(id);
        Integer userId = userIdDto.getId();
        Contact contact = contactRepository.findContactByUserId(userId);
        RegisterRequest response = new RegisterRequest();
        response.setUsername(contact.getUser().getUsername());
        response.setPassword(contact.getUser().getPassword());
        response.setFirstName(contact.getFirstName());
        response.setLastName(contact.getLastName());
        response.setAddress(contact.getAddress());
        response.setMobileNumber(contact.getMobileNumber());
        response.setEmail(contact.getEmail());
        return response;
    }

    public void updateUserInfoById(ContactDto contactDto) {
        User user = userRepository.findByUserId(contactDto.getUserId());
        Contact contact = contactRepository.findContactByUserId(contactDto.getUserId());
        user.setId(contactDto.getUserId());
        user.setUsername(contactDto.getUserUsername());
        user.setPassword(contactDto.getUserPassword());
        contactMapper.updateContactFromContactDto(contactDto, contact);
        contactRepository.save(contact);
        userRepository.save(user);
    }


    public void deleteUserInfoById(Integer userId) {
        contactService.deleteContactById(userId);
        userProfileService.deleteUserById(userId);
    }

    public User getValidUserById(Integer userId) {
        Optional<User> user = userRepository.findById(userId);
        validationService.userExists(user);
        return user.get();
    }


}
