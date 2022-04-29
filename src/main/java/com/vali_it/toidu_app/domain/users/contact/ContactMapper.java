package com.vali_it.toidu_app.domain.users.contact;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {
    @Mapping(source = "usersId", target = "users.id")
    @Mapping(source = "usersUsername", target = "users.username")
    @Mapping(source = "usersPassword", target = "users.password")
    Contact contactDtoToContact(ContactDto contactDto);

    @InheritInverseConfiguration(name = "contactDtoToContact")
    ContactDto contactToContactDto(Contact contact);

    @InheritConfiguration(name = "contactDtoToContact")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateContactFromContactDto(ContactDto contactDto, @MappingTarget Contact contact);
}
