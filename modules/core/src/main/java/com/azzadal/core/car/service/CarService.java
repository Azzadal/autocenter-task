package com.azzadal.core.car.service;

import com.azzadal.core.car.dto.mapper.CarRequestMapper;
import com.azzadal.core.car.dto.mapper.CarResponseMapper;
import com.azzadal.core.car.dto.object.CarRequest;
import com.azzadal.core.car.dto.object.CarResponse;
import com.azzadal.core.car.model.Car;
import com.azzadal.core.car.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис для работы с автомобилями.
 */
@Service
@RequiredArgsConstructor
public class CarService implements EntityService<CarResponse, CarRequest> {
    private final CarRepository repository;
    private final CarResponseMapper responseMapper;
    private final CarRequestMapper requestMapper;

    @Override
    public CarResponse getById(Long id) {
        return responseMapper.toDto(
                repository.findById(id)
                        .isPresent() ? repository.findById(id).get() : null);
    }

    @Override
    public List<CarResponse> getAll() {
        return responseMapper.toDto((List<Car>) repository.findAll());
    }

    @Override
    public CarResponse create(CarRequest request) {
        return save(request);
    }

    @Override
    public CarResponse update(Long id, CarRequest request) {
        request.setId(id);
        return save(request);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private CarResponse save(CarRequest request) {
        Car car = requestMapper.toEntity(request);
        car = repository.save(car);
        return responseMapper.toDto(car);
    }
}
