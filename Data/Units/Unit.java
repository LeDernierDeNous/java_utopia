package Data.Units;

import Data.*;

public abstract class Unit {
    /**
     * Units constants
     */
    private static final int MAX_HEALTH_POINT = 100;
    private static final int MAX_SPEED = 100;
    private static final int MAX_DAMAGE = 100;

    private static final int MIN_HEALTH_POINT = 1;
    private static final int MIN_SPEED = 1;
    private static final int MIN_DAMAGE = 1;

    private static final int BASE_HEALTH_POINT = 50;
    private static final int BASE_SPEED = 50;
    private static final int BASE_DAMAGE = 50;

    private static final int BASE_COST = 10;

    /**
     * Variables
     */
    private int healthPoint;
    private int speed;
    private int damage;
    private Team team;

    public Unit(){
        this.healthPoint=BASE_HEALTH_POINT;
    }

    public int getDamage() {
        return BASE_DAMAGE;
    }

    public int getSpeed() {
        return BASE_SPEED;
    }

    public int getHealthPoint() {
        return this.healthPoint;
    }

    public int getUnitCost() {
        return BASE_COST;
    }

    protected void decreaseHealthPoint(int healthPoint) {
        this.healthPoint -= healthPoint;
    }

    
}