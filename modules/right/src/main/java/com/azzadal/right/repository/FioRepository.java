package com.azzadal.right.repository;

import com.azzadal.right.model.FIO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FioRepository extends JpaRepository<FIO, Long> {
}
