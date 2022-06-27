package com.azzadal.core.car.controller;

import com.azzadal.core.car.dto.object.CarRequest;
import com.azzadal.core.car.dto.object.CarResponse;
import com.azzadal.core.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "core/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public List<CarResponse> getAll()
    {
        System.out.println("request...");
        return carService.getAll();
    }

    @GetMapping(value = "/{id}")
    public CarResponse getById(@PathVariable Long id) {
        return carService.getById(id);
    }

    @PostMapping
    public CarResponse create(CarRequest request) {
        return carService.create(request);
    }

    @PutMapping(value = "/{id}")
    public CarResponse update(@PathVariable Long id, CarRequest request) {
        return carService.update(id, request);
    }
}
