package com.azzadal.right.service;

import com.azzadal.right.dto.mapper.FioMapper;
import com.azzadal.right.dto.mapper.UserResponseMapper;
import com.azzadal.right.dto.object.FioDto;
import com.azzadal.right.model.Role;
import com.azzadal.right.model.User;
import com.azzadal.right.repository.FioRepository;
import com.azzadal.right.repository.RoleRepository;
import com.azzadal.right.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;
    private final FioRepository fioRepository;
    private final FioMapper fioMapper;
    private final UserResponseMapper userResponseMapper;

    public User findByLogin(String login) {
        return userRepo.findByLogin(login);
    }

    public User saveUser(User user) {
        Role userRole = roleRepository.findByName("USER");
        user.setRole(userRole);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public User findByLoginAndPassword(String login, String password) {
        User user = findByLogin(login);
        if (user != null) {
            if (passwordEncoder.matches(password, user.getPassword())) {
                return user;
            }
        }
        return null;
    }

    public FioDto getFio(Long id) {
        return fioMapper.toDto(fioRepository.findById(id).orElseThrow(() -> {
            throw new Error("ФИО не найдено");
        }));
    }
}
