package com.vali_it.toidu_app.service.register;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegisterRequest implements Serializable {
    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String mobileNumber;
    private final String email;
}
