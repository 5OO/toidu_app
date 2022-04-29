package com.vali_it.toidu_app.domain.users.user;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserDto;
import com.vali_it.toidu_app.domain.users.user.UserMapper;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepository userRepository;

    public UserDto addNewUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userRepository.save(user);
        return userMapper.userToUserDto(user);
    }
}
