package usr.scheduleV2;

import java.util.Scanner;

public class Launch {

    static public void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        ScheduleV2 schedule = new ScheduleV2();

        System.out.println("\n-= ����������� ����� =-\n\n" +
                "������� ������ � ������� ����, ����� � �������� ������\n" +
                "(������: 23-10-2021 10:00 ����������)");

        help();

        System.out.print("������� ������: ");
        String str = sc.nextLine();

        while (!str.equals("exit")) {
            if (str.equals("show")) schedule.show();
            else if (str.equals("save")) schedule.saveToFile();
            else if (str.equals("help")) help();
            else schedule.addEvent(new Event(str));
            str = sc.nextLine();
        }
        sc.close();
    }

    public static void help() {
        System.out.println("\n�������� ���������� ����������:\n" +
                "show - ��� ������ � ������� ����������\n" +
                "save - ��� ���������� � ���� (� ����� �������)\n" +
                "open - ��� �������� ����� ���������� (�� ����� �������)\n" +
                "help - ��� ������ ������� ���������� ����������\n" +
                "exit - ��� ������ �� ���������\n");
    }
}
