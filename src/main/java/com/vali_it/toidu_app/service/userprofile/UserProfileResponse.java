package com.vali_it.toidu_app.service.userprofile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileResponse {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private String email;


}
