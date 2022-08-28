package com.behaviour.paramterization;

public class CarTypePredicate implements CarPredicate {
    @Override
    public boolean test(Cars car) {
        return car.getType() == "Hatch";
    }
}
