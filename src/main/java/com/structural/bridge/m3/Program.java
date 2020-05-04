package com.structural.bridge.m3;

public class Program {
    public static void main(String[] args) {
Switch tvButton=new ClickSwitch(new TV());
tvButton.on();
tvButton.off();

Switch radioButton=new ClickSwitch(new Radio());
 radioButton.on();
 radioButton.off();

 Switch lampButton=new ClickSwitch(new Lamp());
 lampButton.on();
 lampButton.off();


    }
}


abstract class Switch{
protected IDevice device;

    public Switch(IDevice device) {
        this.device = device;
    }

public abstract void on();
public abstract void off();
}

class ClickSwitch extends Switch{
    public ClickSwitch(IDevice device) {
        super(device);
    }

    @Override
    public void on() {
      device.on();
    }

    @Override
    public void off() {
device.off();
    }
}

interface IDevice{
    void on();
    void off();
}


class TV implements IDevice{
    @Override
    public void on() {
        System.out.println("the tv was turned on");
    }

    @Override
    public void off() {
        System.out.println("the tv was turned off");
    }
}

class Radio implements IDevice{
    @Override
    public void on() {
        System.out.println("the radio was turned on");
    }

    @Override
    public void off() {
        System.out.println("the radio was turned off");
    }
}

class Lamp implements IDevice{
    @Override
    public void on() {
        System.out.println("the lamp was turned on");
    }

    @Override
    public void off() {
        System.out.println("the lamp was turned off");
    }
}








