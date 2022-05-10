package com.vali_it.toidu_app.service.register;

import com.vali_it.toidu_app.service.profile.ContactDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
@RequestMapping("/profile")
@RestController
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/register")
    @Operation(summary = "Lisab uue kliendi")
    public RegisterResponse registerNewCustomer(@Valid @RequestBody RegisterRequest request) {
        return registerService.registerNewCustomer(request);
    }

    @GetMapping("/id")
    @Operation(summary = "Leiab kontakti id kaudu")
    public RegisterRequest findUserInfoById(@Valid @RequestParam Integer userId) {
        return registerService.findUserInfoById(userId);
    }

    @PutMapping("/id")
    @Operation(summary = "Muudab kontakti user id kaudu")
    public void updateUserInfoById(@Valid @RequestBody ContactDto contactDto) {
        registerService.updateUserInfoById(contactDto);
    }

    @DeleteMapping("/id")
    @Operation(summary = "kustutab kontakti user id kaudu")
    public void deleteUserInfoById(@Valid @RequestParam Integer userId) {
        registerService.deleteUserInfoById(userId);
    }


}
