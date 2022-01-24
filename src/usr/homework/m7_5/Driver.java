package usr.homework.m7_5;

public class Driver extends Person {
    private int drivingExperience;
    private String driveCategory;

    public Driver(String fullName, String sex, int age, int drivingExperience) {
        super(fullName, sex, age);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Водитель {" +
                "ФИО: " + super.getFullName() +
                ", Стаж вождения - " + drivingExperience +
                " лет}";
    }
}