package com.company.vehicles.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.company.vehicles.dto.OperationResponseDto;
import com.company.vehicles.dto.VehicleStockRequestDto;
import com.company.vehicles.dto.vehiclesResponseDto;
import com.company.vehicles.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<vehiclesResponseDto>> getAllVehicles() {
        List<vehiclesResponseDto> vehicles = vehicleService.getAllActiveVehicles();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/low-stock-expensive")
    public ResponseEntity<List<vehiclesResponseDto>> getLowStockExpensiveVehicles() {
        List<vehiclesResponseDto> vehicles = vehicleService.getLowStockExpensiveVehicles();
        return ResponseEntity.ok(vehicles);
    }

    @PatchMapping("/delete/{model}")
    public ResponseEntity<OperationResponseDto> deleteByModel(@PathVariable String model) {
        OperationResponseDto response = vehicleService.deleteByModel(model);
        if (response.isSuccess()) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @PatchMapping("/stock")
    public ResponseEntity<vehiclesResponseDto> updateStock(@RequestBody VehicleStockRequestDto request) {
        vehiclesResponseDto response = vehicleService.updateStock(request);
        if (response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
