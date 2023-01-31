package com.flight.demo.repository;

import com.flight.demo.entity.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Long, CargoEntity> {
}
