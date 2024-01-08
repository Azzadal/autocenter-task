package com.azzadal.car.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Марка автомобиля.
 */
@Getter
@Setter
@Entity
@Table(name = "Mark")
public class Mark extends EntityIdentifier {
    @Column(name = "name")
    private String name;
}
