package com.azzadal.core.car.dto.object;

import lombok.Data;

@Data
public class CarSharingRequest {
    private Long car_id;
    private Long user_id;
    private String connection;
}
