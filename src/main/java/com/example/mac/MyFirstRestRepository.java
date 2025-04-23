package com.example.mac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class MyFirstRestRepository {

    @GetMapping("/get")
    public String getService() {
        return "Hello World From GET web service.";
    }
}
