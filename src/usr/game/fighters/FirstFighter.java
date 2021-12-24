package usr.game.fighters;

public class FirstFighter {

    private String name;
    private int health;
    private int power;
    private boolean isAlive;

    public FirstFighter() {
        super();
    }

    public FirstFighter(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public boolean isAlive() {
        if (this.health > 0) {
            return isAlive = true;
        } else return isAlive = false;
    }
}
