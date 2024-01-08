package com.azzadal.box.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Бокс для автомобилей.
 */
@Getter
@Setter
@Entity
@Table(name = "Box")
public class Box extends EntityIdentifier {
    @Column(name = "appointment")
    private String appointment;

    @Column(name = "capacity")
    private Integer capacity;
}
