package com.azzadal.car.repository;

import com.azzadal.car.model.CarSharing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsharingRepository extends JpaRepository<CarSharing, Long> {
}
