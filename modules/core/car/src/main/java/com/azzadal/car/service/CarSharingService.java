package com.azzadal.car.service;

import com.azzadal.car.dto.object.CarSharingRequest;
import com.azzadal.car.model.CarSharing;
import com.azzadal.car.repository.CarRepository;
import com.azzadal.car.repository.CarsharingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarSharingService {
    private final CarsharingRepository repository;
    private final CarRepository carRepository;

    public CarSharing createRequest(CarSharingRequest request) {
        CarSharing carSharing = new CarSharing();
        carSharing.setCar(carRepository.findById(request.getCar_id()).get());
        carSharing.setConnection(request.getConnection());
        return repository.save(carSharing);
    }
}
