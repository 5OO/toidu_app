package com.vali_it.toidu_app.domain.users.user;


import com.vali_it.toidu_app.service.login.LogInRequest;
import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {


    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;


    public User getValidUser(LogInRequest request) {
        // saame Matrjoska Optional, Mille sees on matrjoska User
        Optional<User> user = userRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
        // Anname meetodis kaasea Matrjoksa optional
        validationService.userExists(user);

        // Võtame Matrjoska Optional seest .get() abiga vlja Matrjoska User ja tagastame selle returniga
        return user.get();   // TODO: 29.04.2022 Rain-le küsimus -   mida võetakse get-ga välja siit?
    }

}
