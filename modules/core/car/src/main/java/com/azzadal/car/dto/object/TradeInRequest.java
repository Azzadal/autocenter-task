package com.azzadal.car.dto.object;

import lombok.Data;

@Data
public class TradeInRequest {
    private Long id;
    private Long userId;
    private String connection;
}
