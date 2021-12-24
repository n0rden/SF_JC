public class Mage {
    private String name;
    private int level;
    private int damage;
    private String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;

        switch (type) {
            case "fire", "ice", "earth":
                this.type = type;
                break;
            default:
                this.type = null;
        }
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    public String fight(Mage mage) {
        if (this.type.equals("fire") && mage.type.equals("ice")) {
            return this.name;
        } else if (this.type.equals("ice") && mage.type.equals("earth")) {
            return this.name;
        } else if (this.type.equals("earth") && mage.type.equals("fire")) {
            return this.name;
        } else if (!this.type.equals(mage.type)) {
            return mage.name;
        } else {
            if (this.level != mage.level) {
                return this.level > mage.level ? this.name : mage.name;
            } else if (this.damage != mage.damage) {
                return this.damage > mage.damage ? this.name : mage.name;
            } else {
                return "draw";
            }
        }
    }
}
