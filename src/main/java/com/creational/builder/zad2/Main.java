package com.creational.builder.zad2;

public class Main {
    public static void main(String[] args) {
        Client client0=new Client("Janusz ");
        Client client1=new Client("Piotr ");
        Client client2=new Client("Seba ");
        Client client3=new Client(" Karina");

        MailServer mail=new MailServer();
mail.connect(client0);
mail.connect(client1);
mail.connect(client2);
mail.connect(client3);

mail.sendMessage(new Mail.Builder().setContent("AAA").createMail(), client0);
    }
}
