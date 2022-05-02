package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.service.register.RegisterRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {


    Contact toEntity(RegisterRequest request);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateContactFromContactDto(RegisterRequest request, @MappingTarget Contact contact);
}
