package com.behavioral.strategy.deve;

public class Client {

    private static final String TEXT_TO_FORMAT = "Strategy Design Pattern";

    public static void main(String[] args) {
        FormatterContext context = new FormatterContext();

        context.set(new CapitalizeFormatter());
        context.print(TEXT_TO_FORMAT);

        context.set(new UpperCaseFormatter());
        context.print(TEXT_TO_FORMAT);

        context.set(new LowerCaseFormatter());
        context.print(TEXT_TO_FORMAT);
    }

}
