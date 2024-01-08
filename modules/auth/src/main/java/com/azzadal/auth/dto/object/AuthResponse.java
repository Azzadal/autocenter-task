package com.azzadal.auth.dto.object;

import com.azzadal.right.dto.object.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private UserResponse userInfo;
}
