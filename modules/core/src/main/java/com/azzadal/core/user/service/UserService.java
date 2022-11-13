package com.azzadal.core.user.service;

import com.azzadal.core.user.model.Role;
import com.azzadal.core.user.model.User;
import com.azzadal.core.user.repository.RoleRepository;
import com.azzadal.core.user.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepo;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepo, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

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
}
