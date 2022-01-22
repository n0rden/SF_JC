public class Main {

    public static void main(String[] args) {
        Driver audiDriver = new Driver("Иванов В.В.", 50, false, 30);
        Engine audiEngine = new Engine("60", "BMW");
        Car car = new Car("Audi", "C", 2000, audiDriver, audiEngine);

        Driver lorryDriver = new Driver("Петров В.В.", 45, false, 20);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver("Сидоров В.В.", 30, false, 15);
        Engine sportEngine = new Engine("80", "SportEngine");
        SportCar sportCar = new SportCar("SportCar", "C", 4000, sportDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }

}
