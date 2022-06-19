package com.azzadal.util.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Абстрактный идентификатор сущности.
 */
@Getter
@Setter
@MappedSuperclass
public abstract class EntityIdentifier implements IdentifierAccessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
}

