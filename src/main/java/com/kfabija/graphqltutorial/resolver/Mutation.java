package com.kfabija.graphqltutorial.resolver;

import com.kfabija.graphqltutorial.exception.VehicleNotFoundException;
import com.kfabija.graphqltutorial.model.*;
import com.kfabija.graphqltutorial.repository.ManufacturerRepository;
import com.kfabija.graphqltutorial.repository.VehicleRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final VehicleRepository vehicleRepository;
    private final ManufacturerRepository manufacturerRepository;

    public Mutation(VehicleRepository vehicleRepository, ManufacturerRepository manufacturerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.manufacturerRepository = manufacturerRepository;
    }

    public Vehicle createVehicle(String name, VehicleType vehicleType){
        Vehicle vehicle = new Vehicle();
        vehicle.setName(name);
        vehicle.setType(vehicleType);

        vehicleRepository.save(vehicle);

        return vehicle;
    }

    public Manufacturer createManufacturer(String name){
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(name);

        manufacturerRepository.save(manufacturer);

        return manufacturer;
    }

    public Vehicle updateVehicle(Long id, String name){
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(id);
        if(!optionalVehicle.isPresent()){
            throw new VehicleNotFoundException();
        }

        Vehicle vehicle = optionalVehicle.get();

        vehicle.setName(name);

        vehicleRepository.save(vehicle);

        return vehicle;
    }
}
