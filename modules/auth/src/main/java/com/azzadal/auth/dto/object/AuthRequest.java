package com.azzadal.auth.dto.object;

import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
}
