package com.behavioral.memento.m3;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

private List mementos;

    public List<Memento> getMemento() {
      if(mementos==null){
          mementos=new ArrayList();
      }
        return mementos;
    }

    public void addMementos(Memento memento) {
        getMemento().add(memento);
    }

    public Memento getMemento(int index) {
        return (Memento) getMemento().get(index);
    }
}

class Memento{
    private final String state;

    public Memento(String state) {
       super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator{
private String state;

    public Originator(String state) {
        super();
        this.state = state;
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }


}


class App{
    public static void main(String[] args) {
        System.out.println("Design pattern: Memento");
         Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("nazwa 1");
originator.setState("nazwa 2");
caretaker.addMementos(originator.createMemento());
originator.setState("nazwa 3");
caretaker.addMementos(originator.createMemento());

        originator.setState("nazwa 4");
        originator.setState("nazwa 5");

        caretaker.addMementos(originator.createMemento());

        System.out.println("Memementos:");
        for(Memento m: caretaker.getMemento()){
            System.out.println(m.getState());
        }

        originator.restoreMemento(caretaker.getMemento(1));
        System.out.println("Restore index 1:"+originator.getState());
    }
}







