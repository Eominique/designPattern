package com.behavioral.memento.m4;

public class MementoCal {

    private String result;

    public MementoCal(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}

class Calculator{

    private String result;

    public String sum(int a,int b) {
     return  result =String.valueOf(a+b);
    }

    public MementoCal saveResult(){
      return new MementoCal(result);
    }

    public String restoreResult(MementoCal m){
    return  result=m.getResult();
    }
}

class Main{
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.sum(12,32);
        MementoCal mem = calculator.saveResult();

        calculator.sum(2,3);
       // System.out.println("Biezacy wynik "+ calculator.);
calculator.restoreResult(mem);


    }
    }