package com.azzadal.car.controller;

import com.azzadal.car.dto.object.TradeInRequest;
import com.azzadal.car.model.TradeIn;
import com.azzadal.car.service.TradeInService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/core/trade-in")
@RequiredArgsConstructor
public class TradeInController {

    private final TradeInService service;

    @PostMapping
    public TradeIn createRequest(@RequestBody TradeInRequest request) {
        return service.createRequest(request);
    }
}
