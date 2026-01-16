package com.company.vehicles.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.vehicles.dto.OperationResponseDto;
import com.company.vehicles.dto.VehicleStockRequestDto;
import com.company.vehicles.dto.vehiclesResponseDto;
import com.company.vehicles.entity.Vehicle;
import com.company.vehicles.mapper.VechicesMapper;
import com.company.vehicles.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
    
    @Autowired
    private VehicleRepository repository;

    public VehicleServiceImpl() {
    }

    @Override
    public List<vehiclesResponseDto> getAllActiveVehicles() {
        List<Vehicle> todos = repository.findAll();
        List<vehiclesResponseDto> respuesta = new ArrayList<>();
        for (Vehicle vehicle : todos) {
            if ("N".equals(vehicle.getDeleted())) {
                respuesta.add(VechicesMapper.toResponseDto(vehicle));
            }
        }
        return respuesta;
    }

    @Override
    public List<vehiclesResponseDto> getLowStockExpensiveVehicles() {
        List<Vehicle> todos = repository.findAll();
        List<vehiclesResponseDto> respuesta = new ArrayList<>();
        for (Vehicle vehicle : todos) {
            if ("N".equals(vehicle.getDeleted()) && vehicle.getStock() < 10 && vehicle.getPrice() > 50000) {
                respuesta.add(VechicesMapper.toResponseDto(vehicle));
            }
        }
        return respuesta;
    }

    @Override
    public OperationResponseDto deleteByModel(String model) {
        Optional<Vehicle> vehicleOpt = repository.findByModel(model);
        if (vehicleOpt.isPresent()) {
            Vehicle vehicle = vehicleOpt.get();
            if ("S".equals(vehicle.getDeleted())) {
                return new OperationResponseDto(false, "Vehicle already deleted", true);
            }
            vehicle.setDeleted("S");
            repository.save(vehicle);
            return new OperationResponseDto(true, "Vehicle deleted successfully");
        }
        return new OperationResponseDto(false, "Vehicle not found");
    }

    @Override
    public vehiclesResponseDto updateStock(VehicleStockRequestDto request) {
        Optional<Vehicle> vehicleOpt = repository.findById(request.getId());
        if (vehicleOpt.isPresent()) {
            Vehicle vehicle = vehicleOpt.get();
            vehicle.setStock(request.getStock());
            Vehicle updated = repository.save(vehicle);
            return VechicesMapper.toResponseDto(updated);
        }
        return null;
    }
}
