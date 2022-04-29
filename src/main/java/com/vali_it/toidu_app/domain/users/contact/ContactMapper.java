package com.vali_it.toidu_app.domain.users.contact;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {                            // TODO: 29.04.2022 küsida miks existing class JPA buddyga ei tööta mapperi loomisel. 
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
