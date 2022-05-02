package com.vali_it.toidu_app.service.login;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController

public class LogInController {

    @Resource
    private LogInService logInService;


    @PostMapping("/login")
    @Operation(summary = "Süsteemi sisse logimine")
    public LoginResponse loginRequest(@RequestBody LogInRequest request) {    //LogInRequest  on Dto

        return logInService.loginRequest(request);
    }

    // TODO: 28.04.2022 //Controller tagastab LoginResponse objekti kus sees on userId ja userRoleId.
    //  Lisada siia controller, mis võtab sisse JSON objekti LogInRequest, kus on username ja password

    //requesti objekt edastada login servicile,mis omakorda edastab user servicile (meetod getValidUser).
    // user service pöördub userrepository poole. Seal peaks olema meetod, mis otsib username ja parooli järgi andmebaasist
    // user objekti(entity)
    // see repository meetod peaks olema tehtud nii et tulemus mähitakse Optionali sisse.
    //Tulemus käes võiks selle edastada validation servicile(user exists meetod).
    //Selle validatsiooni sees peaks kontrollima .isEmpty() abil kas leiti tulemus ja kui ei siis throw new abil visata business error.
    //Saadud user tagastatakse login servicisse.
    //Kui user on olemas, siis selle küljest saab userId.
    //userId pane logInResponse objetki külge.
    //LoginIn Servicist kutsutakse välja userRoleService(meetod) getUserRoleById()
    //userRole objektist saad kätte userRoleId, pane see logInResponse objekti külge.
    //tagasta controlleriga logInResposne objekt.
    //loo front endis selle teenuse jaoks front lahendus(kaasa arvatud error).
}
