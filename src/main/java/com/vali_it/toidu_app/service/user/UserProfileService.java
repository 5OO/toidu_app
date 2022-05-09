package com.vali_it.toidu_app.service.user;

import com.vali_it.toidu_app.domain.users.contact.Contact;
import com.vali_it.toidu_app.domain.users.contact.ContactMapper;
import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserMapper;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import com.vali_it.toidu_app.service.register.RegisterRequest;
import com.vali_it.toidu_app.service.register.RegisterResponse;
import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserProfileService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    @Resource
    private ContactMapper contactMapper;

    @Resource
    private UserProfileResponse userProfileResponse;

    @Resource
    private UserProfileRequest userProfileRequest;


    public UserProfileResponse getUserContact(UserProfileRequest request) {
        Contact contact = contactMapper.toEntity();
        User result = userRepository.getById(response);
userProfileResponse.set

    }

//    public UserProfileResponse updateCustomerContact(UserProfileRequest request) {
//        User user = userMapper.toEntity(request);
//        String username = request.getUsername();
//        boolean userExists = userRepository.existsByUsername(username);
//        validationService.userNameAlreadyExists(username, userExists);
//        userRepository.save(user);
//        return user;
//    }

}
