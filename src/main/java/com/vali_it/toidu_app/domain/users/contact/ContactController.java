package com.vali_it.toidu_app.domain.users.contact;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/contact")

public class ContactController {

    @Resource
    private ContactService contactService;

    @PostMapping
    @Operation(summary = "Lisab uue Contacti")
    public ContactDto addNewContact(@Valid @RequestBody ContactDto contactDto) {
        return contactService.addNewContact(contactDto);
    }
}
