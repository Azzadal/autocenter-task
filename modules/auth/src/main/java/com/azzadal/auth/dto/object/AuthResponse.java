package com.azzadal.auth.dto.object;

import com.azzadal.core.user.dto.object.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private UserResponse userInfo;
}
