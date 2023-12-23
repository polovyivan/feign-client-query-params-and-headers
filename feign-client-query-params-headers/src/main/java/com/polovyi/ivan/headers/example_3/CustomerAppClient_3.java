package com.polovyi.ivan.headers.example_3;

import com.polovyi.ivan.dto.CreateCustomerRequest;
import feign.HeaderMap;
import feign.RequestLine;
import java.util.Map;

public interface CustomerAppClient_3 {

    @RequestLine("POST /customers")
    void createCustomer(@HeaderMap Map<String, Object> headers, CreateCustomerRequest body);
}
