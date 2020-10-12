package com.company;

public class SmallPriceOfCar implements SearchOfCar {
    @Override
    public boolean test(Car car) {

        return car.getPrice()<=1000;
    }
}
