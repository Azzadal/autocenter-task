package com.azzadal.car.dto.object;

import lombok.Data;

@Data
public class RepairServiceRequest {
    private String auto;
    private String serviceType;
    private Long userId;
}
