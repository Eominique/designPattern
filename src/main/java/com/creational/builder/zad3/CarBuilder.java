package com.creational.builder.zad3;

import com.creational.builder.zad3.en.Car;

public interface CarBuilder {

    public void buildTires();
    public void buildEngine();
    public Car getCar();
}
