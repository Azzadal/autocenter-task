package com.azzadal.auth.controller;

import com.azzadal.auth.config.jwt.JwtProvider;
import com.azzadal.auth.dto.mapper.AuthResponseMapper;
import com.azzadal.auth.dto.object.AuthRequest;
import com.azzadal.auth.dto.object.AuthResponse;
import com.azzadal.auth.dto.object.RegistrationRequest;
import com.azzadal.core.user.model.Role;
import com.azzadal.core.user.model.User;
import com.azzadal.core.user.service.RoleService;
import com.azzadal.core.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/auth")
public class AuthController {
    private final UserService userService;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder encoder;
    private final RoleService roleService;

    private final AuthResponseMapper authResponseMapper;

    @PostMapping("/register")
    public String registerUser(@RequestBody @Valid RegistrationRequest registrationRequest) {
        User u = new User();
        u.setPassword(registrationRequest.getPassword());
        u.setLogin(registrationRequest.getLogin());
        u.setRole(roleService.getRolebyName("USER"));
        userService.saveUser(u);
        return "OK";
    }

    @PostMapping
    public AuthResponse auth(@RequestBody AuthRequest request) {
        User user = userService.findByLoginAndPassword(request.getLogin(), request.getPassword());
        String token = jwtProvider.generateToken(user.getLogin());
        return authResponseMapper.toDto(token, user);
//        return new AuthResponse(token);
    }
}
