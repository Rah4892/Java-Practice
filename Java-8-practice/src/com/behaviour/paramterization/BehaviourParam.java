package com.behaviour.paramterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BehaviourParam {
    public static void main(String[] args) {
        List<Cars> inventory = Arrays.asList(new Cars("Sedan", 950000, "Amaze"),
                new Cars("Suv", 1500000, "Creta"),
                new Cars("Hatch", 600000, "Swift"),
                new Cars("Hatch", 1100000, "Altroz"));

        List<Cars> hatchCars = filterCars(inventory, new CarTypePredicate());
        List<Cars> affordableCars = filterCars(inventory, new CarPricePredicate());

        for(Cars car: hatchCars){
            System.out.println("Hatch cars: " + car.name);
        }
        for(Cars car: affordableCars){
            System.out.println("Affordable cars: "+ car.name);
        }

    }

    public static List<Cars> filterCars(List<Cars> inventory, CarPredicate predicate) {
        List<Cars> result = new ArrayList<>();
        for(Cars car: inventory) {
            if (predicate.test(car)) {
                result.add(car);
            }
        }
        return result;
    }
}
