package com.structural.decorator.phone;

public class ApplePhone extends SmartPhone{

    public ApplePhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build()+addOS();
    }

private String addOS(){
        return "IOSm v1.0";
}
}
