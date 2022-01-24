package usr.homework.m7_5;

public class Lorry extends Car {

    private double liftingCapacity;

    public Lorry(String producer, String type, double weight, Driver driver, Engine engine, double liftingCapacity) {
        super(producer, type, weight, driver, engine);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println(super.getEngine().motorSound() + " вперед возить грузы!");
    }

    @Override
    public void stop() {
        System.out.println("Я устал, давай в гараж!");
    }

    @Override
    public String toString() {
        return "Грузовик {" + "Производитель: " + super.getProducer() +
                ", " + super.getDriver() +
                ", Грузоподъемность: " + liftingCapacity +
                " кг}";
    }
}
