package com.behavioral.strategy.deve;

public class UpperCaseFormatter implements TextFormatterStrategy{

    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
