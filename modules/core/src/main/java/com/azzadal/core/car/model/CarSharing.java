package com.azzadal.core.car.model;

import com.azzadal.core.user.model.User;
import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Заявки на каршеринг.
 */
@Getter
@Setter
@Entity
@Table(name = "Carsharing_request")
public class CarSharing extends EntityIdentifier {
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String connection;
}
