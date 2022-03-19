package usr.hw13_7_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] intsArr1 = {14, 34, 34, 8, 9, 152, 7};
        int[] intsArr2 = {1, 13, 7, 669, 3};
        int[] intsArr3 = {79, 71, 9, 11, 4, 23};

        // создаем 3 потока
        SaveAsThread saveAsThread1 = new SaveAsThread(intsArr1, "saveAsThread1.txt", "thread1");
        SaveAsThread saveAsThread2 = new SaveAsThread(intsArr2, "saveAsThread2.txt", "thread2");
        SaveAsThread saveAsThread3 = new SaveAsThread(intsArr3, "saveAsThread3.txt", "thread3");

        // запускаем потоки на выполнение
        saveAsThread1.start();
        saveAsThread2.start();
        saveAsThread3.start();
    }
}
