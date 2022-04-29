package com.vali_it.toidu_app.domain.users.userrole;

import com.vali_it.toidu_app.domain.users.role.Role;
import com.vali_it.toidu_app.domain.users.role.RoleRepository;
import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserRoleService {


    @Resource
    private UserRoleRepository userRoleRepository;

//    @Resource
//    private UserRepository userRepository;
//
//    @Resource
//    private RoleRepository roleRepository;

    public UserRole getUserRoleById(Integer userId) {
        return userRoleRepository.findByUsersId(userId);
    }

//
//    public void addNewUserRoleRelationship(Integer userId, Integer roleId) {
//        User user = userRepository.getById(4);
//        Role role = roleRepository.getById(2);
//
//        UserRole userRole = new UserRole();
//        userRole.setUsers(user);
//        userRole.setRole(role);
//
//
//        userRoleRepository.save(userRole);
//        System.out.println(userRole.getId());
//
//    }
}
