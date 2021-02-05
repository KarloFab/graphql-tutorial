package com.kfabija.graphqltutorial.model;

import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class Manufacturer {

    Long id;
    String name;
    Set<Vehicle> vehicles;
}
