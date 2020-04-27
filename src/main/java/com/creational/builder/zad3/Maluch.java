package com.creational.builder.zad3;

import com.creational.builder.zad3.en.Car;
import com.creational.builder.zad3.en.Engine;
import com.creational.builder.zad3.en.Tires;

public class Maluch implements CarBuilder{

private Car car;

    public Maluch() {
        this.car = new Car();
    }

    @Override
    public void buildTires() {
        Tires tires=new Tires();
        tires.setDurability(100);
        tires.setType("Maluch type");
        car.setTires(tires);
    }

    @Override
    public void buildEngine() {
        Engine engine=new Engine();
        engine.setType("Maluch Engine");
        car.setEngine(engine);
    }

    @Override
    public Car getCar() {
        return car;
    }
}
