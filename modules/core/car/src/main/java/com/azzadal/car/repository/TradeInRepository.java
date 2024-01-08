package com.azzadal.car.repository;

import com.azzadal.car.model.TradeIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeInRepository extends JpaRepository<TradeIn, Long> {
}
