package com.example.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthCheckResource {

    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("The application is running correctly!");
    }
}
