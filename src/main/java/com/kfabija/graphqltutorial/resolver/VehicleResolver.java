package com.kfabija.graphqltutorial.resolver;

import com.kfabija.graphqltutorial.model.Vehicle;
import com.kfabija.graphqltutorial.repository.VehicleRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class VehicleResolver implements GraphQLResolver<Vehicle> {

    private VehicleRepository vehicleRepository;

    public VehicleResolver(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
