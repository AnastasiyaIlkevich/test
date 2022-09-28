package com.sirin.controller;


import com.sirin.domain.LoginInfo;
import com.sirin.domain.UserInfo;
import com.sirin.exception.InvalidUsernameException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController //json
//@Controller //XML
public class BankController {

    @PostMapping("user/login")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {
        if (loginInfo.getUsername().equals("sirin")) {
            return UserInfo.builder()
                    .loginDate(new Date())
                    .username(loginInfo.getUsername())
                    .build();
        }else {
            throw new InvalidUsernameException();
        }
    }
}
