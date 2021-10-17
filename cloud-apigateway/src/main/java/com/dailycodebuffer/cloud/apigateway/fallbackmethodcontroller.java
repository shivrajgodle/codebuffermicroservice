package com.dailycodebuffer.cloud.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackmethodcontroller {

    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod(){

        return "User service taking longer then expected"+ "please try again later";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod(){

        return "Department service taking longer then expected"+ "please try again later";
    }

}
