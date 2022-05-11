package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.service.profile.ContactDto;
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
        contact.setUser(user);
        contactRepository.save(contact);
    }
    public void updateContactById(ContactDto contactDto) {
        Contact contact = contactRepository.findContactByUserId(contactDto.getUserId());
        contactMapper.updateContactFromContactDto(contactDto, contact);
        contactRepository.save(contact);

    }
    public void deleteContactById(Integer userId) {
            Contact contact = contactRepository.findContactByUserId(userId);
            contactRepository.deleteById(contact.getId());
    }
    public Contact getUserFirstLastNameById(Integer userId) {
        return contactRepository.findUserFirstAndLastName(userId);
    }
}
