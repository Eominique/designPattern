package com.structural.adapter.z2;

public class Main {
    public static void main(String[] args) {
   EnemyTank enemyTank=new EnemyTank();
   EnemyRobot enemyRobot=new EnemyRobot();
   EnemyAttacker robot=new EnemyRobotAdapter(enemyRobot);

        System.out.println("The robot");
        enemyRobot.reactToHuman("Paul");
        enemyRobot.walkForward();
        enemyRobot.smashWithHands();

        System.out.println("The Tank ");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.driveForward();

        System.out.println("The robot with Adapter");
robot.assignDriver("Mark");
robot.driveForward();
robot.fireWeapon();


    }
}
