package com.azzadal.right.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Роли пользователей.
 */
@Getter
@Setter
@Entity
@Table(name = "user_role")
public class Role extends EntityIdentifier {
    private String name;
}
