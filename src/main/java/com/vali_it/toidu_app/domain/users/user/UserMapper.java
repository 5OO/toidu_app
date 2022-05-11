package com.vali_it.toidu_app.domain.users.user;

import com.vali_it.toidu_app.service.profile.ContactDto;
import com.vali_it.toidu_app.service.register.RegisterRequest;
import com.vali_it.toidu_app.service.userprofile.UserRequest;
import com.vali_it.toidu_app.service.userprofile.UserResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    User toEntity(RegisterRequest request);

    RegisterRequest toDto(User user);

    UserDto userToUserDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromUserDto(UserDto userDto, @MappingTarget User user);

    User userResponseToUser(UserResponse userResponse);

    UserResponse userToUserResponse(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromContactDto(ContactDto contactDto, @MappingTarget User user);

    User userRequestToUser(UserRequest userRequest);

    UserRequest userToUserRequest(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromUserRequest(UserRequest userRequest, @MappingTarget User user);

}
