package com.vali_it.toidu_app.domain.users.userrole;

import com.vali_it.toidu_app.domain.users.role.RoleDto;
import com.vali_it.toidu_app.domain.users.user.UserDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserRoleDto implements Serializable {
    private final Integer id;
    private final UserDto users;
    private final RoleDto role;
}
