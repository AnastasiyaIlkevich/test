package com.sirin.controller;


import com.sirin.domain.LoginInfo;
import com.sirin.domain.UserInfo;
import com.sirin.exception.InvalidUsernameException;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController //json
//@Controller //XML
public class BankController {

    private Map<String, UserInfo> users = Map.of(
            "sirin", UserInfo.builder().username("sirin").build(),
            "siri", UserInfo.builder().username("siri").build(),
            "sir", UserInfo.builder().username("sir").build(),
            "si", UserInfo.builder().username("si").build());

    @PostMapping("user/login")
    @ApiOperation("авторизация") //позволяет именовать методы в документации
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {
        if (loginInfo.getUsername().equals("sirin")) {
            return UserInfo.builder()
                    .loginDate(new Date())
                    .username(loginInfo.getUsername())
                    .build();
        } else {
            throw new InvalidUsernameException();
        }
    }

    @GetMapping("user/getAll")
    @ApiOperation("коллекция юсеров") //позволяет именовать методы в документации
    public List<UserInfo> getAllUserInfo() {
        return users.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }


}
