package usr.schedule;

import java.io.File;

public class Schedule {

    File file;
    Event[] events = new Event[10];

    public void addEvent(Event event) {
        for (int i = 0; i < events.length; i++) {
            if (events[i] == null) {
                events[i] = event;
                System.out.println("Задача добавлена");
                break;

            } else {
                System.out.println("Расписание на день полное");
                break;
            }
        }
    }


    public void saveToFile() {

    }

    public void show() {

        if (events[0] == null) {
            System.out.println("Расписание пустое");
        } else {
            for (int i = 0; i < events.length; i++) {
                if (events[i] != null) {
                    System.out.println(events[i]);
                }
            }
        }
    }

    public void help() {
        System.out.println("Комманды управления программой:\n" +
                "show - для вывода в консоль расписания\n" +
                "save - для сохранения в файл (пример пути: C:\\Test\\Schedule.txt)\n" +
                "help - для вывода комманд управления программой\n" +
                "exit - для выхода из программы\n");
    }
}
