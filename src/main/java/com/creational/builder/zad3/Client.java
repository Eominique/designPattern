package com.creational.builder.zad3;

import com.creational.builder.zad3.en.Car;

public class Client {
    public static void main(String[] args) {
   CarBuilder carBuilder=new RaceCar();
   CarDirector carDirector=new CarDirector(carBuilder);
   carDirector.makeCar();

   Car car=carBuilder.getCar();
        System.out.println(car);
        System.out.println("kkl");
    }
}
