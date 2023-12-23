package com.polovyi.ivan.headers.example_4;

import com.polovyi.ivan.configuration.ClientConfig;
import com.polovyi.ivan.dto.CreateCustomerRequest;
import feign.Feign;
import feign.Logger.Level;
import feign.Response;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import java.util.Collection;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CustomerAppClient_4 client = Feign.builder()
                .logLevel(Level.FULL)
                .logger(new Slf4jLogger())
                .decoder(new JacksonDecoder(ClientConfig.OBJECT_MAPPER))
                .encoder(new JacksonEncoder(ClientConfig.OBJECT_MAPPER))
                .target(CustomerAppClient_4.class,
                        "http://localhost:8001/spring-customer-app");

        Response response = client.createCustomer(Map.of("Content-Type", "application/json"),
                new CreateCustomerRequest("fullName", "17737278341", "address")
        );
        Collection<String> location = response.headers().get("location");
        System.out.println("location = " + location);
    }
}