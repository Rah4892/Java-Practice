package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

        //map method
        List<Integer> squares = number.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println("squares:"+squares);

        //filter method
        List<String> names = Arrays.asList("New york", "Amsterdam", "Tokyo", "Seoul", "Singapore");
        List<String> stringResult = names.stream().filter(x->x.startsWith("S")).collect(Collectors.toList());
        System.out.println("stringResult:"+ stringResult);

        //sorted method
        stringResult = names.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted stringResult:" + stringResult);

        //collect as set
        List<Integer> numberList = Arrays.asList(4,6,8,15);
        Set<Integer> numberSet = numberList.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("numberSet:"+ numberSet);

        //reduce method to find sum of even numbers
        int even = numberList.stream().filter(x -> x%2==0).reduce(0, Integer::sum);
        System.out.println("even sum:"+even);

        int maxEven = numberList.stream().filter(x -> x%2==0).reduce(0, Integer::max);
        System.out.println("max even:"+maxEven);

        //concatenate strings into one using streams
        List<String> cities = Arrays.asList("Josh", "Robin", "Wayne", "Ras", "Jignes");
        String resultStr = cities.stream().reduce("", String::concat);
        System.out.println("resultStr:" + resultStr);

        //using reduce to find the longest string in list of strings
        List<String> strList = Arrays.asList("Good", "bad", "ugly", "better", "handsome");
        Optional<String> longStr = strList.stream()
                .reduce((s1, s2) -> s1.length() >s2.length() ? s1 : s2);

        System.out.println("longest string:" +longStr);

    }
}
