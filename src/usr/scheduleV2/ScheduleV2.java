package usr.scheduleV2;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ScheduleV2 {

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
        FileOutputStream fos = new FileOutputStream("Schedule_" + sdf.format(calendar.getTime()) + ".txt");

        if (events[0] == null) {
            System.out.println("Расписание пустое, сохранять нечего");
        } else {
            for (int i = 0; i < events.length; i++) {
                if (events[i] != null) {
                    fos.write(events[i].toString().getBytes(StandardCharsets.UTF_8));
                }
            }
            fos.close();
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
