package com.polovyi.ivan.headers.example_2;

import com.polovyi.ivan.dto.CreateCustomerRequest;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface CustomerAppClient_2 {

    @RequestLine("POST /customers")
    @Headers({"Content-Type: {contentType}"})
    void createCustomer(@Param("contentType") String contentType, CreateCustomerRequest body);
}
