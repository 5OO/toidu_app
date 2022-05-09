package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.service.profile.ContactDto;
import com.vali_it.toidu_app.service.register.RegisterRequest;
import com.vali_it.toidu_app.service.register.RegisterResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {


    Contact toEntity(RegisterRequest request);

    Contact toDto(RegisterResponse response);

    Contact contactToRegisterRequest(RegisterRequest registerRequest);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateContactFromContactDto(ContactDto contactDto, @MappingTarget Contact contact);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRequestFromRequestDto(RegisterRequest request, @MappingTarget RegisterRequest registerRequest);


    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "userUserName", target = "user.username")
    @Mapping(source = "userPassword", target = "user.password")
    Contact contactDtoToContact(ContactDto contactDto);

    @InheritInverseConfiguration(name = "contactDtoToContact")
    ContactDto contactToContactDto(Contact contact);

}
