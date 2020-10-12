package com.company;

public class BigPriceOfCar implements SearchOfCar {
    @Override
    public boolean test(Car car) {

        return car.getPrice()>=100000;
    }
}
