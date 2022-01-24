package usr.homework.m7_5;

public class Test {
    public static void main(String[] args) {
        Engine lorryEngine = new DieselEngine(300, "Ford", 8);
        Driver driverOfLorry = new Driver("Вася Петров", "мужской", 35, 15);
        Lorry lorry = new Lorry("Ford", "груховик", 3000, driverOfLorry, lorryEngine, 5000);
        System.out.println(lorry);
        lorry.start();
        lorry.stop();

        Engine sportCarEngine = new GasEngine(500, "Ferrari", 12);
        Driver sportDriver = new Driver("Коля Иванов", "мужской", 25, 7);
        SportCar sportCar = new SportCar("Ferrari", "Sport Car", 1800, sportDriver, sportCarEngine, 300);
        System.out.println(sportCar);
        sportCar.start();
        sportCar.stop();

        Engine speedboatEngine = new GasEngine(500, "Ford", 12);
        Driver speedboatDriver = new Driver("Петя Пупкин", "мужской", 40, 20);
        Speedboat speedboat = new Speedboat("Honda", "speedboat", 2500, speedboatDriver,
                speedboatEngine, 10, 15, 200);
        System.out.println(speedboat);
        speedboat.toSwim();
        speedboat.start();
        speedboat.stop();
    }
}