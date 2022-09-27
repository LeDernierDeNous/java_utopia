package Data.Units;

public abstract class Units {
    private int healthPoint;
    private int damage;
    private int reloadTime;

    protected static final int MIN_VALUE = 0;
    protected static final int MAX_VALUE = 100;

    private int councilment;    // 0 to 100
    private int spoting;        // no limitation
    private int penetration;    // damage when penetration > armor
    private int armor;          // no limitation
    private int precision;      // Hit will arrived when precision/100 > 1/height 
    private int height;         // no limitation

    /**
     * Setters
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setCouncilment(int councilment) {
        this.councilment = councilment;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPenetration(int penetration) {
        this.penetration = penetration;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void setSpoting(int spoting) {
        this.spoting = spoting;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }
    
    /**
     * getters 
     */
    public int getArmor() {
        return armor;
    }

    public int getCouncilment() {
        return councilment;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getHeight() {
        return height;
    }

    public int getPenetration() {
        return penetration;
    }

    public int getPrecision() {
        return precision;
    }

    public int getSpoting() {
        return spoting;
    }

    public int getReloadTime() {
        return reloadTime;
    }
}
