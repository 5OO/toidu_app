package com.vali_it.toidu_app.service.register;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    public RegisterResponse registerNewCustomer(RegisterRequest request) {
        // todo: loo user ja salvesta andmebaasi maha
        // peale seda loo uus kontakt ja salvesta see maha
        // tagasta userId
        return new RegisterResponse(1);
    }
}
