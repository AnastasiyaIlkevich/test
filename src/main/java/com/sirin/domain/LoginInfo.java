package com.sirin.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginInfo {

    private String username;
    private String password;

}
