package com.vali_it.toidu_app.domain.users.userrole;

import com.vali_it.toidu_app.domain.users.contact.Contact;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
        return userRoleRepository.findUserRole(userId);
    }

    public void deleteUserRoleById(Integer userId) {
        UserRole userRole = userRoleRepository.findUserRole(userId);
        userRoleRepository.deleteById(userRole.getUser().getId());
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
