package com.azzadal.right.service;

import com.azzadal.right.model.Role;
import com.azzadal.right.repository.RoleRepository;
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
