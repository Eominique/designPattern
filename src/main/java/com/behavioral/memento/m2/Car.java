package com.behavioral.memento.m2;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String state;

    public Car(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Caretaker{

  private List<Car> mementos=new ArrayList<>();

    public void addMemento(Car car) {
        mementos.add(car);
    }

    public Car getMemento(int index) {
        return mementos.get(index);
    }
}


class Mechanic{
    private String state;

    public void setState(String state) {
        System.out.println(state);
       this.state=state;
    }

    public Car save( ) {
        return new Car(state);
    }

    public void restore(Car m) {
       state=m.getState();
        System.out.println("Returning to the the previous work");
        System.out.println(state);
    }
}


class Main{
    public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    Mechanic mechanic = new Mechanic();
mechanic.setState("The brake drum is in use. Begin of work");
caretaker.addMemento(mechanic.save());
mechanic.setState("The brake drum is available to use.End of work");

mechanic.restore(caretaker.getMemento(0));

    }
    }












