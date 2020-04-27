package com.behavioral.observer.devmatt;

import java.util.ArrayList;

public class YTChannel implements Subject{

    private ArrayList<Observer > observerArrayList;

    public YTChannel() {
        observerArrayList = new ArrayList<>();
    }


    @Override
    public void register(Observer o) {
      observerArrayList.add(o);
    }

    @Override
    public void unregister(Observer o) {
observerArrayList.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("YtChannel: Publishing new video");
        for(Observer o: observerArrayList){
            o.update();
        }
        }
}
