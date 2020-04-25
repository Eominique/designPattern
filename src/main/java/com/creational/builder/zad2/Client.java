package com.creational.builder.zad2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Mail> inboxClient=new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    void receiveMail(Mail mail, Client sender){
        inboxClient.add(mail);
        System.out.println("Client"+ getName()+ " " + sender);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", inboxClient=" + inboxClient +
                '}';
    }
}
