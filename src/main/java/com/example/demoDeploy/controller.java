package com.example.demoDeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

    @GetMapping("/demo/v1/test")
    public String test(){
        return "welcome";

    }
}
