/*      Автомобили.

        Создать классы: Car, Engine и Driver.
        Класс Driver содержит поля - ФИО, стаж вождения и расширяет класс Person.
        Класс Engine содержит поля - мощность, производитель.
        Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
        Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
        "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле,
        ее водителе и моторе.
        Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
        Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.*/

public class Car {

    private String producer;
    private String aClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String producer, String aClass, double weight, Driver driver, Engine engine) {
        this.producer = producer;
        this.aClass = aClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}