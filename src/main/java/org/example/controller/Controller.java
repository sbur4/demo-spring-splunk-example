package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        log.info("Accessing index endpoint");
        return "Hello from Spring Boot Splunk!";
    }
}
