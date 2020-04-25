package com.creational.builder.zad2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MailServer {

    private List<Client> connectedClient =new ArrayList<>();

    void connect(Client c){
        connectedClient.add(c);
    }

    void disConnected(Client c){
        if(connectedClient.contains(c)){
            connectedClient.remove(c);
        }
    }

    void sendMessage(Mail m, Client client){
        m.setDateFinish(LocalDateTime.now());
        for(Client cli: connectedClient){
            if(!cli.equals(client)){
                cli.receiveMail(m, client);
            }
        }
    }

}
