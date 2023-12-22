package com.polovyi.ivan.headers.example_1;

import com.polovyi.ivan.dto.CreateCustomerRequest;
import com.polovyi.ivan.dto.CustomerResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import java.util.List;

public interface CustomerAppClient_1 {

    @RequestLine("POST /customers")
    @Headers({"Content-Type:  application/json"})
    void createCustomer(CreateCustomerRequest body);
}
