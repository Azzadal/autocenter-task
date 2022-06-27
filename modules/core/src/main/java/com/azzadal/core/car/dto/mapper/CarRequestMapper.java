package com.azzadal.core.car.dto.mapper;

import com.azzadal.core.car.dto.object.CarRequest;
import com.azzadal.core.car.model.Car;
import com.azzadal.util.mapper.ToEntityMapper;
import org.mapstruct.Mapper;

@Mapper
public interface CarRequestMapper extends ToEntityMapper<Car, CarRequest> {
}
