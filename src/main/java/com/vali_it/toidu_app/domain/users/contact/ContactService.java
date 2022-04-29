package com.vali_it.toidu_app.domain.users.contact;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Service
public class ContactService {
    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactRepository contactRepository;


    public ContactDto addNewContact(ContactDto contactDto) {
        Contact contact = contactMapper.contactDtoToContact(contactDto);
        contactRepository.save(contact);
        return contactMapper.contactToContactDto(contact);
    }
}
