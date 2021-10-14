package com.gigacedi.employeesystemmanagement.DemoRestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")
public class DemoRestAPIController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
