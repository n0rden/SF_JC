package usr.homework.m7_5;

abstract public class Engine {

    private int power;
    private String producer;


    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    abstract public String motorSound();
}
