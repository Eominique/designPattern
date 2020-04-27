package com.creational.builder.zad3;

import com.creational.builder.zad3.en.Car;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void makeCar(){
        carBuilder.buildEngine();
        carBuilder.buildTires();
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }

}
