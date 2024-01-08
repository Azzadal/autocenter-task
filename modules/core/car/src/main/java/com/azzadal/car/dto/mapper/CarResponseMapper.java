package com.azzadal.car.dto.mapper;

import com.azzadal.car.dto.object.CarResponse;
import com.azzadal.car.model.Car;
import com.azzadal.util.mapper.ToDtoMapper;
import org.mapstruct.Mapper;

@Mapper
public interface CarResponseMapper extends ToDtoMapper<Car, CarResponse> {
}
