package com.behavioral.strategy.deve;

public class LowerCaseFormatter implements TextFormatterStrategy{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
