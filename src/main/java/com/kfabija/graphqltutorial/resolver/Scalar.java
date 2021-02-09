package com.kfabija.graphqltutorial.resolver;

import graphql.Scalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Scalar {

    @Bean
    public GraphQLScalarType longType() {
        return Scalars.GraphQLLong;
    }
}
