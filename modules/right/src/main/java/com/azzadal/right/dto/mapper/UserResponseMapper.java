package com.azzadal.right.dto.mapper;

import com.azzadal.right.dto.object.UserResponse;
import com.azzadal.right.model.User;
import com.azzadal.util.mapper.ToDtoMapper;
import org.mapstruct.Mapper;

@Mapper
public interface UserResponseMapper extends ToDtoMapper<User, UserResponse> {
}
