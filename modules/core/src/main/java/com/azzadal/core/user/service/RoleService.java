package com.azzadal.core.user.service;

import com.azzadal.core.user.model.Role;
import com.azzadal.core.user.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getRolebyName(String roleName) {
        return roleRepository.findByName(roleName);
    }
}
