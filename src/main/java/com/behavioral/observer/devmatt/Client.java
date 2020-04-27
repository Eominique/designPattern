package com.behavioral.observer.devmatt;

public class Client {
    public static void main(String[] args) {
   YTChannel channel=new YTChannel();
   YTUser user=new YTUser("Matt");
channel.register(user);

channel.notifyObservers();
        System.out.println("---------");


 YTUser user1=new YTUser("Patt");
 channel.register(user1);
 channel.notifyObservers();
        System.out.println("-------------");

 channel.unregister(user);
 channel.notifyObservers();
        System.out.println("-------------");


    }
}
