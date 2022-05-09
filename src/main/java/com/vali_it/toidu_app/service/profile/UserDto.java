package com.vali_it.toidu_app.service.profile;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final Integer id;
    private final String username;
    private final String password;
}
