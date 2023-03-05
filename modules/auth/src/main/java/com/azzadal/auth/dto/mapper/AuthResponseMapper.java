package com.azzadal.auth.dto.mapper;

import com.azzadal.auth.dto.object.AuthResponse;
import com.azzadal.core.user.dto.mapper.UserResponseMapper;
import com.azzadal.core.user.dto.object.UserResponse;
import com.azzadal.core.user.model.User;
import com.azzadal.util.mapper.ToDtoMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
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
