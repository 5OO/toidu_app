package com.vali_it.toidu_app.service.register;

import com.vali_it.toidu_app.domain.users.user.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping
    @Operation(summary = "Lisab uue kliendi")
    public RegisterResponse registerNewCustomer(@Valid @RequestBody RegisterRequest request) {
        return registerService.registerNewCustomer(request);
    }

}
