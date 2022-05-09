package com.vali_it.toidu_app.service.user;

import com.vali_it.toidu_app.service.register.RegisterRequest;
import com.vali_it.toidu_app.service.register.RegisterResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/profile")
public class UserProfileController {

    @Resource
    private UserProfileService userProfileService;

    @GetMapping("/")
    @Operation(summary = "Profiili andmete kätte saamine")
    public UserProfileResponse getUserContact(@Valid @RequestBody UserProfileRequest request) {
        return userProfileService.getUserContact(request);
    }
//    @PutMapping("/update")
//    @Operation(summary = "Profiili andmete muutmine")
//    public UserProfileResponse updateUserContact(@Valid @RequestBody UserProfileRequest request) {
//        return userProfileService.updateCustomerContact(request);
//    }

}
