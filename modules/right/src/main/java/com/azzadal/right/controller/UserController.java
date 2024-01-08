package com.azzadal.right.controller;

import com.azzadal.right.dto.mapper.UserResponseMapper;
import com.azzadal.right.dto.object.UserResponse;
import com.azzadal.right.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserResponseMapper userResponseMapper;

    @GetMapping(value = "/{login}")
    public UserResponse findUserByLogin(@PathVariable String login) {
        return userResponseMapper.toDto(userService.findByLogin(login));
    }
 }
