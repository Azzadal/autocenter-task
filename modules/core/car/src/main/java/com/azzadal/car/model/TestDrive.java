package com.azzadal.car.model;

import com.azzadal.right.model.User;
import com.azzadal.util.model.EntityIdentifier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Заявки на тест-драйв.
 */
@Getter
@Setter
@Entity
@Table(name = "Test_drive_request")
public class TestDrive extends EntityIdentifier {

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date testDriveDate;

    private String connection;
}
