package com.flacademy.springboot.helloworldapp.model;

public class Product {
    private  int id;
    private  String name;
    private double price;
    private  String brand;
    private String category;

    public Product(){

    }

    public Product(int id, String name, double price, String brand, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

