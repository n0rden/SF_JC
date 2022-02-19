package usr.schedule;

import java.util.Calendar;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;

public class Schedule {

    File file;
    Event[] events = new Event[10];

    public void addEvent(Event event) {
        int arrLength = events.length;

        if (events[arrLength - 1] != null) {
            System.out.println("Расписание на день полное");
        } else {
            for (int i = 0; i < arrLength; i++) {
                if (events[i] == null) {
                    events[i] = event;
                    System.out.println("Задача добавлена");
                    break;
                }
            }
        }
    }

    public void saveToFile() throws Exception {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_kk_mm");

        file = new File("Schedule_" + sdf.format(calendar.getTime()) + ".txt");

        if (file.createNewFile()) {
            System.out.println("Файл создан в корневой директории проекта");
        } else System.out.println("Файл уже существует в директории проекта");

        FileWriter writer = new FileWriter(file, false);

        if (events[0] == null) {
            System.out.println("Расписание пустое, сохранять нечего");
        } else {
            for (int i = 0; i < events.length; i++) {
                if (events[i] != null) {
                    writer.append(events[i].toString());
                }
            }
            writer.close();
            System.out.println("Данные в файл записаны");
        }
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
}
