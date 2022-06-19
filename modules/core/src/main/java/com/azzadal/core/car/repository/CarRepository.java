package com.azzadal.core.car.repository;

import com.azzadal.core.car.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
