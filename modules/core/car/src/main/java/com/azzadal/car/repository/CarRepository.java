package com.azzadal.car.repository;

import com.azzadal.car.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
