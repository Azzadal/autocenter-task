package com.azzadal.car.controller;

import com.azzadal.car.dto.object.CarRequest;
import com.azzadal.car.dto.object.CarResponse;
import com.azzadal.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "core/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public List<CarResponse> getAll(){
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
