package com.optionalclass;

@FunctionalInterface
public interface FuncInterface {
    void abstract_method(int x, int y);
    //void abstract_method2();
    default void default_method () {
        System.out.println("This is the default method");
    }
}

class main{
    public static void main(String[] args) {
        FuncInterface obj = (int x, int y) -> System.out.println(x+y);
        obj.abstract_method(5,6);
        obj.default_method();
    }
}
