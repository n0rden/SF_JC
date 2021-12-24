public class Loader {

    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));

        int i = 45;
        while (i != 350) {
            i++;
        }
        System.out.println("Value i = " + i);

        int j = 10;
        do j--; while (j > 1);
        System.out.println("Value j = " + j);

        light("red");

        int variable = 7;
        System.out.println(variable > 10 ? variable - 10 : variable + 10);
    }

    public static String decode(char ch) {
        switch (ch) {
            case 'h':
                return "Hello!";
            case 'i', 'm', 'k':
                return "I can decode!";
            case 'b':
                return "Bye!";
            default:
                return "I don't know these symbols :(";
        }
    }

    public static void light(String color) {
        switch (color) {
            case "red":
                System.out.println("остановиться");
                break;
            case "yellow":
                System.out.println("подождать");
                break;
            case "green":
                System.out.println("ехать");
                break;
            default:
                System.out.println("нет такого сигнала светофора!");
                break;
        }
    }
}