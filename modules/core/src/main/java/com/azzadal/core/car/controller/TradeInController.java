package com.azzadal.core.car.controller;

import com.azzadal.core.car.model.TradeIn;
import com.azzadal.core.car.service.TradeInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/core/trade-in")
public class TradeInController {
    @Autowired
    private TradeInService service;

    @PostMapping
    public TradeIn createRequest(@RequestBody TradeIn request) {
        return service.createRequest(request);
    }
}
