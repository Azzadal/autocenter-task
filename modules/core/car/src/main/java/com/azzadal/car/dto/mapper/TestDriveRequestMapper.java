package com.azzadal.car.dto.mapper;

import com.azzadal.car.dto.object.TestDriveRequest;
import com.azzadal.car.model.TestDrive;
import com.azzadal.car.repository.CarRepository;
import com.azzadal.util.mapper.ToEntityMapper;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public abstract class TestDriveRequestMapper implements ToEntityMapper<TestDrive, TestDriveRequest> {
    private CarRepository carRepository;

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    @Mapping(target = "car", ignore = true)
    public abstract TestDrive toEntity(TestDriveRequest request);

    @AfterMapping
    protected void aftetMapping(TestDriveRequest request, @MappingTarget TestDrive testDrive) {
        testDrive.setCar(carRepository.findById(request.getCar_id()).get());
    }
}
