package com.company.vehicles.service;

import java.util.List;

import com.company.vehicles.dto.VehicleStockRequestDto;
import com.company.vehicles.dto.vehiclesResponseDto;
import com.company.vehicles.dto.OperationResponseDto;

public interface VehicleService {
    
    List<vehiclesResponseDto> getAllActiveVehicles();

    List<vehiclesResponseDto> getLowStockExpensiveVehicles();
    
    OperationResponseDto deleteByModel(String model);

    vehiclesResponseDto updateStock(VehicleStockRequestDto request);

}
