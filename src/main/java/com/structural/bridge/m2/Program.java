package com.structural.bridge.m2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Program {
    public static void main(String[] args) {
        BridgeImpl bridge=new BridgeImpl(new ClassImplFirst());
    }





}

abstract class Bridge{
    private IInterfaceEncapsulation interfaceEncapsulation;

    public Bridge(IInterfaceEncapsulation interfaceEncapsulation) {
        this.interfaceEncapsulation = interfaceEncapsulation;
    }

    public void doMethodOne(){
        interfaceEncapsulation.doMethodOne();
    }

    public void doMethodTwo(){
        interfaceEncapsulation.doMethodTwo();
    }

}

interface IInterfaceEncapsulation{
    void doMethodOne();
    void doMethodTwo();
    }

class BridgeImpl extends Bridge{
    public BridgeImpl(IInterfaceEncapsulation interfaceEncapsulation) {
        super(interfaceEncapsulation);
    }

    public void getMethod(){
         doMethodOne();
         doMethodTwo();
    }

}

class ClassImplFirst implements IInterfaceEncapsulation{
    @Override
    public void doMethodOne() {
        throw  new NotImplementedException();
    }

    @Override
    public void doMethodTwo() {
        throw  new NotImplementedException();
    }
}



class ClassImplSecond implements IInterfaceEncapsulation{

    @Override
    public void doMethodOne() {
        throw  new NotImplementedException();
    }

    @Override
    public void doMethodTwo() {
        throw  new NotImplementedException();
    }
}









