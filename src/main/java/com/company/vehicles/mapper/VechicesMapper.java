package com.company.vehicles.mapper;

import com.company.vehicles.dto.vehiclesResponseDto;
import com.company.vehicles.entity.Vehicle;

public class VechicesMapper {
        public static Vehicle toEntity(long id, String brand, String model, Double price, int stock, String delete){
        return new Vehicle( id, brand, model, price, stock, delete);
    }

    public static vehiclesResponseDto toResponse(Vehicle vehicle){
        vehiclesResponseDto dto= new vehiclesResponseDto();
        dto.id= vehicle.getId();
        dto.brand= vehicle.getBrand();
        dto.delete= vehicle.getDelete();
        dto.model= vehicle.getModel();
        dto.price= vehicle.getPrice();
        dto.stock= vehicle.getStock();
        return dto;
    };

}
