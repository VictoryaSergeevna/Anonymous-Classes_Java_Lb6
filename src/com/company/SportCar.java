package com.company;

public class SportCar implements SearchOfCar {
    @Override
    public boolean test(Car car) {

        return car.getType() == TypeCar.SPORT;
    }
}
