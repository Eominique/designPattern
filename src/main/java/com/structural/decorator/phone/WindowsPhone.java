package com.structural.decorator.phone;

public class WindowsPhone extends SmartPhone{
    public WindowsPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build()+addOs();
    }

    private String addOs() {
        return "Windows Phone v1.0";
    }


}
