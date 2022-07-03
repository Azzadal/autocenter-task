package com.azzadal.core.car.dto.object;

import com.azzadal.core.car.model.Car;
import com.azzadal.core.user.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class TestDriveRequest {
    private Car car;
    private User user;
    private String connection;
    private Date testDriveDate;
}
