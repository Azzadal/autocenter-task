package com.azzadal.core.user.dto.mapper;

import com.azzadal.core.user.dto.object.UserResponse;
import com.azzadal.core.user.model.User;
import com.azzadal.util.mapper.ToDtoMapper;
import org.mapstruct.Mapper;

@Mapper
public interface UserResponseMapper extends ToDtoMapper<User, UserResponse> {
}
