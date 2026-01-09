package com.company.vehicles.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/users")
public class VehicleController {

    @GetMapping("path")
    public ResponseEntity<> getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
