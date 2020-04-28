package com.structural.decorator.phone;

public class BasicPhone implements Phone{
    @Override
    public String build() {
        return "Screen, Battery, Processor";
    }
}
