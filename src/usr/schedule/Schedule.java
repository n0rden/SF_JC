package usr.schedule;

import java.io.File;

public class Schedule {

    File file;
    Event[] events = new Event[10];

    public void addEvent(Event event) {
        for (int i = 0; i < events.length; i++) {
            if (events[i] == null) {
                events[i] = event;
                System.out.println("������ ���������");
                break;

            } else {
                System.out.println("���������� �� ���� ������");
                break;
            }
        }
    }


    public void saveToFile() {

    }

    public void show() {

        if (events[0] == null) {
            System.out.println("���������� ������");
        } else {
            for (int i = 0; i < events.length; i++) {
                if (events[i] != null) {
                    System.out.println(events[i]);
                }
            }
        }
    }

    public void help() {
        System.out.println("�������� ���������� ����������:\n" +
                "show - ��� ������ � ������� ����������\n" +
                "save - ��� ���������� � ���� (������ ����: C:\\Test\\Schedule.txt)\n" +
                "help - ��� ������ ������� ���������� ����������\n" +
                "exit - ��� ������ �� ���������\n");
    }
}
