package usr.homework.m7_5;

public class SportCar extends Car {

    private int topSpeed;

    public SportCar(String producer, String type, double weight, Driver driver, Engine engine, int topSpeed) {
        super(producer, type, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public void start() {
        System.out.println(super.getEngine().motorSound() + " погнали!!!");
    }

    @Override
    public void stop() {
        System.out.println("Надо бы отдохнуть!");
    }

    @Override
    public String toString() {
        return "Спорткар {" + "Производитель: " + super.getProducer() +
                ", " + super.getDriver() +
                ", Максимальная скорость: " + topSpeed + "км/ч" +
                "}";
    }
}
