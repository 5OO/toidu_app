package com.vali_it.toidu_app.service.login;


import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogInService {
    @Resource
    private UserService userService;


    public LoginResponse loginRequest(LogInRequest request) {
        LoginResponse loginResponse = new LoginResponse();

        User user = userService.getValidUser(request);
        Integer userId = user.getId();

        loginResponse.setUserId(userId);

//        loginResponse.setUserRoleId(????);

        // useri abil leiad ülesse roleId
        return loginResponse;
    }
}
