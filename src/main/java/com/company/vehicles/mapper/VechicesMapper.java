package com.company.vehicles.mapper;

import com.company.vehicles.dto.vehiclesResponseDto;
import com.company.vehicles.entity.Vehicle;

public class VechicesMapper {
    
    public static Vehicle toEntity(long id, String brand, String model, Double price, int stock, String deleted) {
        return new Vehicle(id, brand, model, price, stock, deleted);
    }

    public static vehiclesResponseDto toResponseDto(Vehicle vehicle) {
        vehiclesResponseDto dto = new vehiclesResponseDto();
        dto.setId(vehicle.getId());
        dto.setBrand(vehicle.getBrand());
        dto.setDeleted(vehicle.getDeleted());
        dto.setModel(vehicle.getModel());
        dto.setPrice(vehicle.getPrice());
        dto.setStock(vehicle.getStock());
        return dto;
    }
}
