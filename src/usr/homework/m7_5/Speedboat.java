package usr.homework.m7_5;

public class Speedboat extends Car implements Swimmable {

    private int tonnage;
    private int consumption;
    private int topSpeed;

    public Speedboat(String producer, String type, double weight, Driver driver, Engine engine, int tonnage,
                     int consumption, int topSpeed) {
        super(producer, type, weight, driver, engine);
        this.tonnage = tonnage;
        this.consumption = consumption;
        this.topSpeed = topSpeed;
    }

    @Override
    public void start() {
        System.out.println(super.getEngine().motorSound() + " отдать концы!");
    }

    @Override
    public void stop() {
        System.out.println("Суши весла, приплыли!");
    }

    @Override
    public void toSwim() {
        System.out.println("Я могу плавать!!!");
    }

    @Override
    public String toString() {
        return "Катер {" +
                "Производитель: " + super.getProducer() +
                ", " + super.getDriver() +
                ", водоизмещение = " + tonnage + " тонн" +
                ", расход топлива = " + consumption + " л/ч" +
                ", максимальная скорость = " + topSpeed + " км/ч" +
                '}';
    }
}