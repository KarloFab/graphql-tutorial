package com.kfabija.graphqltutorial.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;
import java.util.Set;

@Entity
@Value
@Builder
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    @OneToMany
    Set<Vehicle> vehicles;
}
