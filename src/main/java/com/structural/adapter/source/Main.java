package com.structural.adapter.source;


public class Main {
    public static void main(String[] args) {
 RoundHole  roundHole=new RoundHole(5);
 SquarePegAdapter squarePegAdapter;

 for(int i=6;i<10;i++){
     squarePegAdapter=new SquarePegAdapter(i);
     squarePegAdapter.makeFit(roundHole);
 }

    }
}
