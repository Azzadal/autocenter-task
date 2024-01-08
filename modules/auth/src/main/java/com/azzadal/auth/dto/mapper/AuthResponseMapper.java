package com.azzadal.auth.dto.mapper;

import com.azzadal.auth.dto.object.AuthResponse;
import com.azzadal.right.dto.mapper.UserResponseMapper;
import com.azzadal.right.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Data
public class AuthResponseMapper {
    private final UserResponseMapper userResponseMapper;

    public AuthResponse toDto(String token, User user) {
        return new AuthResponse(token, userResponseMapper.toDto(user));
    }
}
