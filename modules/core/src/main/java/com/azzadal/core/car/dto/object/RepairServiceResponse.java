package com.azzadal.core.car.dto.object;

import lombok.Data;

@Data
public class RepairServiceResponse {
    private Long id;
    private Long user_id;
    private String auto;
    private String serviceType;
}
