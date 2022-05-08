package com.vali_it.toidu_app.service.register;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/register")
    @Operation(summary = "Lisab uue kliendi")
    public RegisterResponse registerNewCustomer(@Valid @RequestBody RegisterRequest request) {
        return registerService.registerNewCustomer(request);
    }

}
