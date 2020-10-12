package com.company;

public class Car {
    private TypeCar type;
    private float price;

    public Car (TypeCar type, float price){
        this.price = price;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public TypeCar getType() {
        return type;
    }
}
