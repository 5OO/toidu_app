package com.vali_it.toidu_app.service.userprofile;

import com.vali_it.toidu_app.service.profile.ContactDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserProfileController {

    @Resource
    private UserProfileService userProfileService;

    @GetMapping("/id")
    @Operation(summary = "Useri andmete kätte saamine id kaudu")
    public UserResponse getUserInfoById(@RequestParam Integer request) {
        return userProfileService.getUserInfoById(request);
    }

    @PutMapping("/id")
    @Operation(summary = "Useri andmete muutmine")
    public void updateUserInfoById(@RequestBody ContactDto contactDto) {
        userProfileService.updateUserInfoById(contactDto);
    }

    @DeleteMapping ("/id")
    @Operation(summary = "Useri kustutamine id kaudu")
    public void deleteUserById(@RequestParam Integer id) {
        userProfileService.deleteUserById(id);
    }

}
