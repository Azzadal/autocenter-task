package com.azzadal.auth.controller;

import com.azzadal.auth.config.jwt.JwtProvider;
import com.azzadal.auth.dto.mapper.AuthResponseMapper;
import com.azzadal.auth.dto.object.AuthRequest;
import com.azzadal.auth.dto.object.AuthResponse;
import com.azzadal.auth.dto.object.RegistrationRequest;
import com.azzadal.right.dto.mapper.FioMapper;
import com.azzadal.right.model.User;
import com.azzadal.right.service.UserService;
import com.azzadal.right.service.RoleService;
import lombok.RequiredArgsConstructor;
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
    private final FioMapper fioMapper;

    private final AuthResponseMapper authResponseMapper;

    @PostMapping("/register")
    public String registerUser(@RequestBody @Valid RegistrationRequest registrationRequest) {
        User user = new User();
        user.setPassword(encoder.encode(registrationRequest.getPassword()));
        user.setLogin(registrationRequest.getLogin());
        // косяк с фио
        user.setFIO(fioMapper.toEntity(userService.getFio(registrationRequest.getFio().getId())));
        user.setAddress(registrationRequest.getAddress());
        user.setBirthday(registrationRequest.getBirthday());
        user.setEmail(registrationRequest.getEmail());
        user.setRole(roleService.getRolebyName("USER"));
        userService.saveUser(user);
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
