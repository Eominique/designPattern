package com.behavioral.strategy.deve;

public class FormatterStrategy {

    private TextFormatterStrategy strategy;

    public void setStrategy(TextFormatterStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(String text) {
      String formattedText=strategy.format(text);
        System.out.println(formattedText);
    }
}
