package com.structural.decorator.phone;

public class DecoratorExample {
    public static void main(String[] args) {
        Phone androidPhone=new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());


    }
}
