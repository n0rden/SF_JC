package usr.homework.m7_5;

public class DieselEngine extends Engine {

    private static final String PETROL = "diesel";
    private int cylinders;

    public DieselEngine(int power, String producer, int cylinders) {
        super(power, producer);
        this.cylinders = cylinders;
    }

    @Override
    public String motorSound() {
        return "Bu-Bu-Bu";
    }
}
