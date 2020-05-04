package com.structural.bridge.m5;

public enum Tlok {
cd,
    dvd,
    bd
}

interface PlytkaInterface{
    void akcja();
}

abstract class Plytka{
    protected PlytkaInterface plytkaInterface;
    protected Tlok type;
    protected String name;

    public Plytka(Tlok type,String name, PlytkaInterface plytkaInterface  ) {
        this.plytkaInterface = plytkaInterface;
        this.type = type;
        this.name = name;
    }

    public String get() {
        return name+ type;
    }

    public void set(String s,Tlok type) {
        this.name=s;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void akcja();
}


class KPlytka extends Plytka{
    public KPlytka(Tlok type, String name, PlytkaInterface plytkaInterface) {
        super(type, name, plytkaInterface);
    }

    @Override
    void akcja() {
    plytkaInterface.akcja();
    }
}


class Nagrywanie implements PlytkaInterface{
    @Override
    public void akcja() {
        System.out.println("nagrywam plytke");
    }
}

class Odczytywanie implements PlytkaInterface{
    @Override
    public void akcja() {
        System.out.println("Odczytuje plytke");
    }
}

class Main{
    public static void main(String[] args) {
 Plytka ob1=new KPlytka(Tlok.dvd, "TDK", new Nagrywanie());
 Plytka ob2=new KPlytka(Tlok.cd, "Dysan", new Odczytywanie());

        ob1.akcja();
        System.out.println(ob1.get() + "\n");
        ob2.akcja();
        System.out.println(ob2.get() + "\n");
        ob1.set("Verbatim", Tlok.bd);
        ob1.akcja();
        System.out.println(ob1.get() + "\n");

    }
}










