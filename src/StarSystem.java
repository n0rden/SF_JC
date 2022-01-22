public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private int age;

    public StarSystem(String starName, int quantityOfPlanets, int age) {
        this.starName = starName;
        this.age = age;
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public String getStarName() {
        return starName;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return starName + " " + quantityOfPlanets + " " + age;
    }
}