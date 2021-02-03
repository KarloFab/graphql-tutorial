package com.kfabija.graphqltutorial.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Vehicle {

    Long id;
    String name;
    VehicleType vehicleType;

}
