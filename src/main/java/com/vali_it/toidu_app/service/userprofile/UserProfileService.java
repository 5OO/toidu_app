package com.vali_it.toidu_app.service.userprofile;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserMapper;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import com.vali_it.toidu_app.service.profile.ContactDto;
import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserProfileService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    @Resource
    private UserMapper userMapper;


    public UserResponse getUserInfoById(Integer request) {
        User response = userRepository.getById(request);
        UserResponse userResponse = new UserResponse();
        userResponse.setUsername(response.getUsername());
        userResponse.setPassword(response.getPassword());
        return userResponse;
    }


    public void updateUserInfoById(ContactDto contactDto) {
        // TODO: 09.05.2022 valideerimine
        Integer userId = contactDto.getUserId();
        User user = userRepository.getById(userId);
        userMapper.updateUserFromContactDto(contactDto, user);
        userRepository.save(user);
    }

    public void deleteUserById(Integer id) {
        User user = getValidUserById(id);
        userRepository.deleteById(user.getId());
    }

    public User getValidUserById(Integer userId) {
        Optional<User> user = userRepository.findById(userId);
        validationService.userExists(user);
        return user.get();
    }


}
