package com.azzadal.core.user.dto.object;

import lombok.Data;

import java.util.Date;

@Data
public class UserResponse {
    private Long id;
    private String login;
    private String FIO;
    private Date birthday;
    private String email;
    private String address;
    private String telefon;
}
