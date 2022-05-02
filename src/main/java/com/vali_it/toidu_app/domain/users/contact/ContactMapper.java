package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.service.register.RegisterRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {                            // TODO: 29.04.2022 küsida miks existing class JPA buddyga ei tööta mapperi loomisel. 

    Contact toContact(RegisterRequest request);



    @InheritConfiguration(name = "toContact")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateContactFromContactDto(RegisterRequest request, @MappingTarget Contact contact);
}
