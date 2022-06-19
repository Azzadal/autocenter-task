package com.azzadal.core.user.repository;

import com.azzadal.core.user.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
