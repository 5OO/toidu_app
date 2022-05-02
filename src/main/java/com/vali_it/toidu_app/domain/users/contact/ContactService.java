package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.service.register.RegisterRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContactService {
    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactRepository contactRepository;

    public void addNewContact(User user, RegisterRequest request) {
        Contact contact = contactMapper.toEntity(request);
        contact.setUsers(user);
        contactRepository.save(contact);
    }


//    public RegisterRequest addNewContact(RegisterRequest request) {
//        Contact contact = contactMapper.toContact(request);
//        contactRepository.save(contact);
//        return contactMapper.toContact(contact);
//    }
}
