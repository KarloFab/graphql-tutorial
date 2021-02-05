package com.kfabija.graphqltutorial.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;

@Entity
@Value
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    VehicleType type;

    @ManyToOne
    Manufacturer manufacturer;
}
