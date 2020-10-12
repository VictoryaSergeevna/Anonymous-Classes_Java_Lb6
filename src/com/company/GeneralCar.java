package com.company;

public class GeneralCar implements SearchOfCar {
    @Override
    public boolean test(Car car) {

        return car.getType() == TypeCar.GENERAL;
    }
}
