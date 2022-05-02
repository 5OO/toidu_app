package com.vali_it.toidu_app.service.register;

import com.vali_it.toidu_app.domain.users.contact.ContactService;
import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterService {
    @Resource
    private UserService userService;
    @Resource
    private ContactService contactService;
    public RegisterResponse registerNewCustomer(RegisterRequest request) {
        User user = userService.addNewUser(request);
        contactService.addNewContact(user, request);
        // todo: loo user ja salvesta andmebaasi maha
        // peale seda loo uus kontakt ja salvesta see maha
        // tagasta userId
        return new RegisterResponse(1);
    }
}
