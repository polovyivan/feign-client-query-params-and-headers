package com.polovyi.ivan.headers.example_3;

import com.polovyi.ivan.configuration.ClientConfig;
import com.polovyi.ivan.dto.CreateCustomerRequest;
import feign.Feign;
import feign.Logger.Level;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CustomerAppClient_3 client = Feign.builder()
                .logLevel(Level.FULL)
                .logger(new Slf4jLogger())
                .decoder(new JacksonDecoder(ClientConfig.OBJECT_MAPPER))
                .encoder(new JacksonEncoder(ClientConfig.OBJECT_MAPPER))
                .target(CustomerAppClient_3.class,
                        "http://localhost:8001/spring-customer-app");

        client.createCustomer(Map.of("Content-Type", "application/json"),
                new CreateCustomerRequest("fullName", "17737278341", "address")
        );
    }
}