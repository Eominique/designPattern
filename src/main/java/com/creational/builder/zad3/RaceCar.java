package com.creational.builder.zad3;

import com.creational.builder.zad3.en.Car;
import com.creational.builder.zad3.en.Engine;
import com.creational.builder.zad3.en.Tires;

public class RaceCar implements CarBuilder{

    private Car car;

    public RaceCar() {
        this.car = new Car();
    }

    @Override
    public void buildTires() {
        Tires tires = new Tires();
        tires.setDurability(50);
        tires.setType("Slicks");

        car.setTires(tires);
    }

    @Override
    public void buildEngine() {
        Engine engine = new Engine();
        engine.setType("v8");

        car.setEngine(engine);
        }

    @Override
    public Car getCar() {
        return car;
    }
}
