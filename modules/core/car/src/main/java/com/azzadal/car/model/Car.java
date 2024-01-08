package com.azzadal.car.model;

import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Автомобиль.
 */
@Getter
@Setter
@Entity
@Table(name = "Car")
public class Car extends EntityIdentifier {

    @ManyToOne
    @JoinColumn(name = "mark_id", nullable = false)
    private Mark mark;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @Column(name = "color")
    private String color;

    @Column(name = "status")
    private String status;
}
