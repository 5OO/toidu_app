package com.vali_it.toidu_app.service.login;


import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserService;
import com.vali_it.toidu_app.domain.users.userrole.UserRole;
import com.vali_it.toidu_app.domain.users.userrole.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogInService {
    @Resource
    private UserService userService;

    @Resource
    private UserRoleService userRoleService;


    public LoginResponse loginRequest(LogInRequest request) {
        LoginResponse loginResponse = new LoginResponse();
        User user = userService.getValidUser(request);
        Integer userId = user.getId();
        loginResponse.setUserId(userId);
        UserRole userRole = userRoleService.getUserRoleById(userId);
        loginResponse.setUserRoleId(userRole.getRole().getId());
        return loginResponse;
    }
}
