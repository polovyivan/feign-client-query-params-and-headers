package com.polovyi.ivan.headers.example_4;

import com.polovyi.ivan.dto.CreateCustomerRequest;
import feign.HeaderMap;
import feign.RequestLine;
import feign.Response;
import java.util.Map;

public interface CustomerAppClient_4 {

    @RequestLine("POST /customers")
    Response createCustomer(@HeaderMap Map<String, Object> headers, CreateCustomerRequest body);
}
