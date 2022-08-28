package com.behaviour.paramterization;

public class CarPricePredicate implements CarPredicate {
    @Override
    public boolean test(Cars car) {
        return car.getPrice() < 1000000;
    }
}
