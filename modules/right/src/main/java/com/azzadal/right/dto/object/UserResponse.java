package com.azzadal.right.dto.object;

import lombok.Data;

import java.util.Date;

@Data
public class UserResponse {
    private Long id;
    private String login;
    private FioDto FIO;
    private Date birthday;
    private String email;
    private String address;
    private String telefon;
}
