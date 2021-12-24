package usr.util.imt;

import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вес (в кг): ");
        double mass = sc.nextDouble();
        System.out.print("Введиет рост (в см): ");
        double heigh = sc.nextDouble();

        imtCalc(mass, heigh);

    }

    private static void imtCalc(double mass, double height) {
        double result = 0;
        if (height != 0) {
            result = mass / height * height;
        }

        if (result <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (result > 16 && result <= 18.5) {
            System.out.println("Недостаточная (дефицит) масса тела");
        } else if (result > 18.5 && result <= 25) {
            System.out.println("Норма");
        } else if (result > 25 && result <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (result > 30 && result <= 35) {
            System.out.println("Ожирение 1 степени");
        } else if (result > 35 && result <= 40) {
            System.out.println("Ожирение 2 степени");
        } else {
            System.out.println("Ожирение 3 степени");
        }
    }
}
