package com.behavioral.observer.z1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class User implements ChangeListener<String> {
    String name;

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

    }
}
