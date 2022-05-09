package com.vali_it.toidu_app.service.user;

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
    private UserMapper userMapper;

//    @Resource
//    private UserProfileResponse userProfileResponse;

//    @Resource
//    private UserProfileRequest userProfileRequest;


//    public UserProfileResponse getUserContact(UserProfileRequest request) {
//        Integer response = userProfileRequest.getUserId();
//        User result = userRepository.getById(response);
//        userProfileResponse.getUsername() = result.getUsername();
//
//
//    }

//    public UserProfileResponse updateCustomerContact(UserProfileRequest request) {
//        User user = userMapper.toEntity(request);
//        String username = request.getUsername();
//        boolean userExists = userRepository.existsByUsername(username);
//        validationService.userNameAlreadyExists(username, userExists);
//        userRepository.save(user);
//        return user;
//    }

}
