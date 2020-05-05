package com.behavioral.memento.m1;

import java.util.ArrayList;
import java.util.List;

public class MementoScheme {

private String state;

    public MementoScheme(String state) {
        this.state = state;    }

    public String getState() {
        return state;
    }
}

class Caretaker{

private List<MementoScheme> mementos=new ArrayList<>();

    public void addMemento(MementoScheme m) {
        mementos.add(m);
    }

    public MementoScheme getMemento(int index) {
//       return mementos[index];
  return mementos.get(index);
    }
}

class Originator{

private String state;

    public void setState(String state) {
        System.out.println("Orginator: Setting state to"+state);
       this.state=state;
    }

    public MementoScheme save( ) {
        System.out.println("Originator: Saving to Memento");
      return new MementoScheme(state);
    }


    public void restore(MementoScheme m) {
    state=m.getState();
        System.out.println("Originator: State after restoring from Memento"+state);
           }

}


class Main{
    public static void main(String[] args) {
Caretaker caretaker=new Caretaker();
        Originator originator = new Originator();
originator.setState("State1");
originator.setState("State2");

caretaker.addMemento(originator.save());
originator.setState("State3");
caretaker.addMemento(originator.save());
originator.setState("State4");
originator.restore(caretaker.getMemento(1));
    }
    }












