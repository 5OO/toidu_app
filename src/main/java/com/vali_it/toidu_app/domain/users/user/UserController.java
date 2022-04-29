package com.vali_it.toidu_app.domain.users.user;

import com.vali_it.toidu_app.domain.users.user.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/id")
    @Operation(summary = "Lisab uue Useri")
    public UserDto addNewUser(@Valid @RequestBody UserDto userDto) {
        return userService.addNewUser(userDto);
    }
}
