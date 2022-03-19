package usr.hw13_7_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SaveAsThread implements Runnable {
    private int[] intsArr;      // ������������ ������
    private String filename;    // ��� �����
    private String threadName;  // ��� ������
    private Thread thread;      // ������ �� ������� �����

    // ����������� - �������� 3 ���������:
    // intsArr - ������, ������� ����� �������� � ����;
    // filename - ��� �����, � ������� ������������ ������ AI;
    // threadName - ��� ������.
    public SaveAsThread(int[] intsArr, String filename, String threadName) {
        this.intsArr = intsArr;
        this.filename = filename;
        this.threadName = threadName;

        thread = new Thread(this, "SaveThread");
    }

    // ��������� ������� �����
    public void start() {
        thread.start();
    }

    public void run() {
        System.out.println("Begin thread: " + threadName);

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            PrintStream printStream = new PrintStream(fos);

            // ���������� ������ intsArr � ����
            printStream.println(intsArr.length);
            for (int i = 0; i < intsArr.length; i++) {
                printStream.println(intsArr[i]);
            }

            printStream.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // �������� � ���������� ������
        System.out.println("End thread: " + threadName);
    }
}
