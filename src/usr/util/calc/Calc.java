package usr.util.calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCalcOn = true;
        System.out.println("Введите первый операнд, необходимую операцию (+, -, *, /) и второй операнд,");
        System.out.println("для сброса значений введите \"C\", для выхода из программы \"s\":");

        /* Внешний цикл, проверяет введенеа ли команда 's'
         * в первом операнде для завершения работы программы */
        while (isCalcOn) {
            String str = sc.next();
            if (str.charAt(0) == 's') {
                break;
            }
            double firstOperand = Double.parseDouble(str);

            /* Внутренний цикл, проверяет введенеа ли команда 'C' или 's'
             * в требуемой операции и втором операнде для сброса введеных значений */
            while (true) {
                str = sc.next();
                if (str.toLowerCase().charAt(0) == 's') {
                    isCalcOn = false;
                    break;
                } else if (str.toUpperCase().charAt(0) == 'C') {
                    System.out.println("Значения обнулены, введите новые значения:");
                    break;
                }
                char operation = str.charAt(0);

                str = sc.next();
                if (str.toLowerCase().charAt(0) == 's') {
                    isCalcOn = false;
                    break;
                } else if (str.toUpperCase().charAt(0) == 'C') {
                    System.out.println("Значения обнулены");
                    break;
                }
                double secondOperand = Double.parseDouble(str);

                System.out.print("= " + selector(firstOperand, operation, secondOperand) + " ");

                firstOperand = selector(firstOperand, operation, secondOperand);
            } //while
        } //while
        sc.close();
    } //main

    /* Метод "selector" определяет действия программы
     * для введенной пользователем операции */
    private static double selector(double firstOperand, char operation, double secondOperand) {
        double result = 0;

        switch (operation) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                /*
                 * Нужна проверка деления на 0 через Exception, но мы этого не проходили */
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    result = firstOperand;
                    System.out.println("ОШИБКА, деление на ноль");
                }
                break;
            default:
                System.out.println("ОШИБКА, неизвестная операция");
        } //switch
        return result;
    } //selector
} // Calc class