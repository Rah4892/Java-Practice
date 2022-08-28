package com.lambda.expression;

import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {
        String str = "This is a test string to check the length";
        Runnable r = () -> System.out.println("This is in runnable");
        Runnable r1 = () -> System.out.println(str);
        //Runnable r2 = (x,y)-> System.out.println(x);
        r.run();
        r1.run();

        final int recordId = 1234;
        Runnable r3 = () -> System.out.println(recordId);
        //recordId = 5678;
        r3.run();

    }
}
