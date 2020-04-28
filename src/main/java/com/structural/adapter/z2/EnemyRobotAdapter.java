package com.structural.adapter.z2;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
       enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String s) {
enemyRobot.reactToHuman(s);
    }
}
