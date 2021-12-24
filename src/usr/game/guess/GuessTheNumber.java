package usr.game.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижний предел :");
        int lowLimit = sc.nextInt();
        System.out.println("Введите вверхний предел :");
        int heightLimit = sc.nextInt();
        System.out.println("Введите количество попыток: ");
        int count = sc.nextInt();

        guess(lowLimit, heightLimit, count);
    }

    private static void guess(int lowLimit, int heightLimit, int count) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean isGuessed = false;
        int guessNumber = rand.nextInt(lowLimit, heightLimit);
        System.out.println(guessNumber);

        System.out.println("Введите число от " + lowLimit + " до " + heightLimit + " :");
        int userNumber = sc.nextInt();

        while (count != 0) {
            if (userNumber > guessNumber) {
                System.out.println("Загаданное мною число меньше");
                System.out.println("Осталовь " + --count + " попыток");
                userNumber = sc.nextInt();
            } else if (userNumber < guessNumber) {
                System.out.println("Загаданное мною число больше");
                System.out.println("Осталовь " + --count + " попыток");
                userNumber = sc.nextInt();
            } else {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                isGuessed = true;
                break;
            }
        }
        if (isGuessed == false) {
            System.out.println("Я загадал: " + guessNumber);
        }
    }
}
