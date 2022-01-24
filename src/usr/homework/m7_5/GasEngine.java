package usr.homework.m7_5;

public class GasEngine extends Engine {

    private static final String PETROL = "gas";
    private int cylinders;

    public GasEngine(int power, String producer, int cylinders) {
        super(power, producer);
        this.cylinders = cylinders;
    }

    @Override
    public String motorSound() {
        return "Wrum-Wrum";
    }
}
