import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
/*    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 1, 3};
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j + 1 < a.length; j++) {
                if (a[i] == a[j + 1]) {
                    count++;
                }
            }
            System.out.println("Символ " + a[i] + " повторяется " + count + " раз");
        }
    }*/

/*    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        try {

            for (boolean sheep : arrayOfSheeps) {
                if (sheep == true) {
                    counter++;
                }
            }

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return counter;
    }*/

/*    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        String str = new String();
        str.concat("123");
        return null;
    }*/

/*    public static void main(String[] args) {

        maxLength(arrReader());
    }

    public static String[] arrReader() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int length = sc.nextInt();
        String[] strArr = new String[length];
        System.out.println("Введите массив слов: ");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.next();
        }

        return strArr;
    } // arrReader()

    public static void maxLength(String[] strArr) {

        int maxLength = 0;

        for (String s : strArr) {
            if (maxLength < s.length()) {
                maxLength = s.length();
            }
        }
        System.out.printf("Длина самого длинного слова - %d символов", maxLength);
    } // maxLength()*/

/*      public static void main(String[] args) {
        ToLine line = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] arr = line.resize();

        ToTable table = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] multiArr = table.resize();*/

/*
        Mage fireMage = new Mage("Merlin", 10, 10, "fire");
        System.out.println(fireMage.getInfo());
        Mage fireMage1 = new Mage("Merlin1", 10, 15, "fire");
        System.out.println(fireMage1.getInfo());
        Mage iceMage = new Mage("Cotlin", 10, 10, "ice");
        System.out.println(iceMage.getInfo());

        System.out.println(fireMage.fight(fireMage1));
*/

/*        LimitingRectangle rectangle = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}, {8, 10}, {-12, 5}, {-10, 70}});
        System.out.println(rectangle.getHeight() + " " + rectangle.getWidth());
        System.out.println(rectangle.getBorders());*/

/*    public static class EmailValidator {

        private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        private static Pattern pattern;
        private Matcher matcher;

        public EmailValidator() {
            pattern = Pattern.compile(EMAIL_REGEX);
        }

        public boolean validateEmail(String email) {
            matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }

    public static void main(String args[]) {

        EmailValidator ev = new EmailValidator();

        // список правильных адресов
        String[] validEmails = new String[]{"corpname@gmail.com", "corpname-100@gmail.com",
                "corpname.100@gmail.com", "corpname111@corpname.com", "corpname-100@corpname.net",
                "corpname.100@corpname.com.ru", "corpname@1.com", "corpname@gmail.com.com",
                "corpname+100@gmail.com", "corpname-100@gmail-test.com", "corpname_100@gmail-test.abcd.com"};

        // список неправильных адресов
        String[] invalidEmails = new String[]{"corpname", "corpname@.com.my",
                "corpname123@gmail.a", "corpname123@.com", "corpname123@.com.com", ".corpname@corpname.com",
                "corpname()*@gmail.com", "corpname@%*.com", "corpname..2002@gmail.com", "corpname.@gmail.com",
                "corpname@corpname@gmail.com", "corpname@gmail.com.1a"};

        for (String temp : validEmails) {
            boolean valid = ev.validateEmail(temp);
            System.out.println("E-mail адрес: " + temp + " верный? " + valid);
        }

        System.out.println("\n\n");
        for (String temp : invalidEmails) {
            boolean valid = ev.validateEmail(temp);
            System.out.println("E-mail адрес: " + temp + " верный? " + valid);
        }
    }*/

    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        System.out.println(board.makeMove(1, 1)); // X
        System.out.println(board.makeMove(1, 1)); // 0
        System.out.println(board.makeMove(1, 2)); // 0
        System.out.println(board.makeMove(2, 1)); // X
        System.out.println(board.makeMove(2, 2)); // 0
        System.out.println(board.makeMove(3, 1)); // X
        System.out.println(board.makeMove(2, 2)); //

    }

} // Main class
