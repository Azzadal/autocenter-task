package com.azzadal.core.car.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Модель автомобиля.
 */
@Getter
@Setter
@Entity
@Table(name = "Model")
public class Model extends EntityIdentifier {
    @Column(name = "name")
    private String name;
}
