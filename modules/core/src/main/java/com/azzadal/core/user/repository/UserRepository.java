package com.azzadal.core.user.repository;

import com.azzadal.core.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
