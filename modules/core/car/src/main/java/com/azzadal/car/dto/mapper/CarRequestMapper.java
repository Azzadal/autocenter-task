package com.azzadal.car.dto.mapper;

import com.azzadal.car.dto.object.CarRequest;
import com.azzadal.car.model.Car;
import com.azzadal.util.mapper.ToEntityMapper;
import org.mapstruct.Mapper;

@Mapper
public interface CarRequestMapper extends ToEntityMapper<Car, CarRequest> {
}
