package com.kfabija.graphqltutorial.resolver;

import com.kfabija.graphqltutorial.repository.VehicleRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private VehicleRepository vehicleRepository;
}
