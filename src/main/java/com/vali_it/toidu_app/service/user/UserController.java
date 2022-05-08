package com.vali_it.toidu_app.service.user;

import com.vali_it.toidu_app.domain.users.user.UserService;
import com.vali_it.toidu_app.service.register.RegisterRequest;
import com.vali_it.toidu_app.service.register.RegisterResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PutMapping("/profile")
    @Operation(summary = "Profiili andmete muutmine")
    public RegisterResponse updateCustomerContact(@Valid @RequestBody RegisterRequest request) {
        return userService.updateCustomerContact(request);
    }

}
