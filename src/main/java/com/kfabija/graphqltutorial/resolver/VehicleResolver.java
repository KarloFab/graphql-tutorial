package com.kfabija.graphqltutorial.resolver;

import com.kfabija.graphqltutorial.model.Vehicle;
import com.kfabija.graphqltutorial.model.VehicleType;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class VehicleResolver implements GraphQLQueryResolver {

    public Vehicle getVehicle(Long id) {
        log.info("Retrieving vehicle by id: {}", id);

        return Vehicle.builder().id(id).vehicleType(VehicleType.CAR).name("VW").build();
    }
}
