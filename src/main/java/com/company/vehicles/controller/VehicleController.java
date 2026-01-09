package com.company.vehicles.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/users")
public class VehicleController {

    @GetMapping
    public ResponseEntity<List<vehiclesResponseDto>> getAllVehicle(@RequestParam String param) {
        return new String();
    }


    @GetMapping("/low-stock-expensive")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @PatchMapping("/delete/{model}")
    public ResponseEntity<OperationResponseDto> deleteByModel(){

    }

      @PatchMapping("/stock")
    public ResponseEntity<OperationResponseDto> deleteByModel(){

    }

    
    
}
