package com.creational.builder.devmat;

public class Client {
    public static void main(String[] args) {

Cat cat=new Cat.Builder()
        .setName("Kicia")
        .setAge(3)
        //.setColor("Black")
        .setOwner("Matt")
        .build();

        System.out.println(cat);
    }
}
