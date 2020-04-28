package com.structural.adapter.z2;

import java.util.Random;

public class EnemyRobot {

    Random generator= new Random();

    public void smashWithHands(){
       int attackDamage=generator.nextInt(10)+1;
        System.out.println("Enemy Robot Causes"+ attackDamage+ " damage ");
    }

    public void walkForward(){
int movement=generator.nextInt(5)+1;
        System.out.println("Enemy Robots walks forward"+ movement+"spaces" );
    }

    public void reactToHuman(String s){
        System.out.println("Enemy Robot tramps on"+s);
    }


}
