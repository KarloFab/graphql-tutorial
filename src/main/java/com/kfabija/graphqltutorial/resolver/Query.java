package com.kfabija.graphqltutorial.resolver;

import com.kfabija.graphqltutorial.model.Manufacturer;
import com.kfabija.graphqltutorial.model.Vehicle;
import com.kfabija.graphqltutorial.repository.ManufacturerRepository;
import com.kfabija.graphqltutorial.repository.VehicleRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {

    private final VehicleRepository vehicleRepository;
    private final ManufacturerRepository manufacturerRepository;

    public Query(VehicleRepository vehicleRepository, ManufacturerRepository manufacturerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.manufacturerRepository = manufacturerRepository;
    }

    public Iterable<Vehicle> findAllVehicles(){
        return vehicleRepository.findAll();
    }

    public Iterable<Manufacturer> findAllManufactures(){
        return manufacturerRepository.findAll();
    }

    public long countVehicles() {
        return vehicleRepository.count();
    }

    public long countManufacturers(){
        return manufacturerRepository.count();
    }
}
