package com.company.vehicles.dto;

public class VehicleStockRequestDto {
    private long id;
    private int stock;

    public VehicleStockRequestDto() {
    }

    public VehicleStockRequestDto(long id, int stock) {
        this.id = id;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
