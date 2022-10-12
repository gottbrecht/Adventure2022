package org.example;

public class Enemy {

    public String enemy;
    public String enemyName;
    public String enemyDescription;

    public Enemy(String enemyName, String enemyDescription) {
        this.enemy = enemy;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
    }

    public String getEnemy() {
        return enemy;
    }
    public String getEnemyName() {
        return enemyName;
    }
    public String getEnemyDescription() {
        return enemyName;
    }

    @Override
    public String toString() {
        return enemyName + ": " + enemyDescription;
    }
}

