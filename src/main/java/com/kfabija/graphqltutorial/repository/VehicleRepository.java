package com.kfabija.graphqltutorial.repository;

import com.kfabija.graphqltutorial.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
