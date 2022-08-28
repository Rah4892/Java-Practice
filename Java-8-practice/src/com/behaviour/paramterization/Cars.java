package com.behaviour.paramterization;

public class Cars {
    String type;
    int price;
    String name;

    public Cars(String type, int price, String name) {
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
