package com.azzadal.core.user.controller;

import com.azzadal.core.user.model.User;
import com.azzadal.core.user.service.UserService;
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

    @GetMapping(value = "/{login}")
    public User findUserByLogin(@PathVariable String login) {
        return userService.findByLogin(login);
    }
}
