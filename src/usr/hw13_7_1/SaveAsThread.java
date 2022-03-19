package usr.hw13_7_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SaveAsThread implements Runnable {
    private final int[] intsArr;      // записываемый массив
    private final String filename;    // им€ файла
    private final String threadName;  // им€ потока
    private final Thread thread;      // ссылка на текущий поток

    //  онструктор - получает 3 параметра:
    // intsArr - массив, который нужно записать в файл;
    // filename - им€ файла, в который записываетс€ массив AI;
    // threadName - им€ потока.
    public SaveAsThread(int[] intsArr, String filename, String threadName) {
        this.intsArr = intsArr;
        this.filename = filename;
        this.threadName = threadName;

        thread = new Thread(this, "SaveThread");
    }

    // запускаем текущий поток
    public void start() {
        thread.start();
    }

    public void run() {
        System.out.println("Begin thread: " + threadName);

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            PrintStream printStream = new PrintStream(fos);

            // «аписываем массив intsArr в файл
            printStream.println(intsArr.length);
            for (int j : intsArr) {
                printStream.println(j);
            }

            printStream.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // —ообщаем о завершении потока
        System.out.println("End thread: " + threadName);
    }
}

