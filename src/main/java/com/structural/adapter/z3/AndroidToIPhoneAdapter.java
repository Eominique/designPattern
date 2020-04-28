package com.structural.adapter.z3;

public class AndroidToIPhoneAdapter implements IPhone{

    AndroidPhone androidPhone;

    public AndroidToIPhoneAdapter(AndroidPhone androidPhone) {
        this.androidPhone = androidPhone;
    }

    public void charge(){
        androidPhone.charge();
    }
}
