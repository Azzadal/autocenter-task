package com.azzadal.core.car.dto.mapper;

import com.azzadal.core.car.dto.object.CarResponse;
import com.azzadal.core.car.model.Car;
import com.azzadal.util.mapper.ToDtoMapper;
import org.mapstruct.Mapper;

@Mapper
public interface CarResponseMapper extends ToDtoMapper<Car, CarResponse> {
}
