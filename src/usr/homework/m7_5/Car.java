package usr.homework.m7_5;

abstract public class Car {

    private String producer;
    private String type;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String producer, String type, double weight, Driver driver, Engine engine) {
        this.producer = producer;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    abstract public void start();
    abstract public void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    abstract public String toString();
}
