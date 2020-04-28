package com.structural.adapter.z3;

public class AdapterExample {
    public static void main(String[] args) {
AndroidChanger androidChanger=new AndroidChanger();
AndroidPhone androidPhone=new OnePLus5();
androidChanger.charge(androidPhone);

IPhoneCharger iPhoneCharger=new IPhoneCharger();
IPhone iPhone=new IPonesX();
iPhoneCharger.charge(iPhone);

AndroidToIPhoneAdapter adapter=new AndroidToIPhoneAdapter(androidPhone);
iPhoneCharger.charge(adapter);
    }
}
