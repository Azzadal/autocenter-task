package com.azzadal.core.car.controller;

import com.azzadal.core.car.dto.object.CarSharingRequest;
import com.azzadal.core.car.model.CarSharing;
import com.azzadal.core.car.service.CarSharingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/core/car-sharing")
public class CarSharingController {
    @Autowired
    private CarSharingService service;

    @PostMapping
    public CarSharing createRequest(@RequestBody CarSharingRequest request) {
        return service.createRequest(request);
    }
}
