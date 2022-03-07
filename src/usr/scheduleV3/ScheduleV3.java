package usr.scheduleV3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ScheduleV3 {
    int taskCount = 10;
    Event[] events = new Event[taskCount];

    public void addEvent(Event event) {

        if (events[taskCount - 1] != null) {
            System.out.println("Time is busy");
        } else {
            for (int i = 0; i < taskCount; i++) {
                if (events[i] == null) {
                    events[i] = event;
                    System.out.println("Task added");
                    break;
                }
            }
        }
    }

    public void saveToFile(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_kk_mm");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("Schedule_" + sdf.format(calendar.getTime()) + ".txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error!!! File not exist");
        }

        if (events[0] == null) {
            System.out.println("Schedule is empty. Nothing to save");
        } else {
            for (Event event : events) {
                if (event != null) {
                    try {
                        fos.write(event.toString().getBytes(StandardCharsets.UTF_8));
                    } catch (IOException e) {
                        System.out.println("Error!!! File not saved");
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println("Schedule saved");
        }
    }

    public void show() {

        if (events[0] == null) {
            System.out.println("Schedule is empty");
        } else {
            for (Event event : events) {
                if (event != null) {
                    System.out.println(event);
                }
            }
        }
    }
}