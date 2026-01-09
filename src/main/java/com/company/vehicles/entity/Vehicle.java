package com.company.vehicles.entity;

public class Vehicle {
    private long id;
    private String brand;
    private String model;
    private Double price;
    private int stock;
    private String delete;

    public Vehicle(long id, String brand, String model, Double price, int stock, String delete) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
        this.delete = delete;
    }


public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}

public int getStock() {
    return stock;
}

public void setStock(int stock) {
    this.stock = stock;
}

public String getDelete() {
    return delete;
}

public void setDelete(String delete) {
    this.delete = delete;
}    
    
    
}
