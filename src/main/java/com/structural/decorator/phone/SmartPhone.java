package com.structural.decorator.phone;

//Decorator
public abstract class SmartPhone implements Phone {

private final Phone phone;


    public SmartPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String build() {
        return phone.build();
    }
}
