package com.kfabija.graphqltutorial.repository;

import com.kfabija.graphqltutorial.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
