package com.vali_it.toidu_app.service.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactDto implements Serializable {
    private String userUsername;
    private String userPassword;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private String email;
}
