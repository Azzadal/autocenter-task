package com.azzadal.car.dto.object;

import com.azzadal.right.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class TestDriveRequest {
    private Long car_id;
    private User user;
    private String connection;
    private Date testDriveDate;
}
