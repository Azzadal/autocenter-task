package com.azzadal.car.model;

import com.azzadal.right.model.User;
import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Заявки на тест-драйв.
 */
@Getter
@Setter
@Entity
@Table(name = "Repair_service")
public class RepairService extends EntityIdentifier {
    private String auto;
    private String serviceType;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
