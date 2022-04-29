package com.vali_it.toidu_app.domain.users.contact;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContactDto implements Serializable {
    private final Integer id;
    private final UserDto users;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String mobileNumber;
    private final String email;
}
