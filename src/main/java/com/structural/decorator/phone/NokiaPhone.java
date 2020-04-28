package com.structural.decorator.phone;

public class NokiaPhone extends SmartPhone{
    public NokiaPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build()+ addBranding();
    }

    private String addBranding() {
        return "Microsoft Phone";
    }


}
