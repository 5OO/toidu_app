package com.vali_it.toidu_app.domain.users.user;


import com.vali_it.toidu_app.service.login.LogInRequest;

import javax.annotation.Resource;


public class UserService {


    @Resource
    private UserRepository userRepository;


    public User getValidUser(LogInRequest request) {
        userRepository.findByUsernameAndPassword()


        return null;
    }
}
