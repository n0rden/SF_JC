package usr.scheduleV3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScheduleV3 {
    Set<Event> events = new TreeSet<>();

    public void addEvent(Event event) {
        if (events.contains(event)) {
            System.out.println("Time is busy");
        } else {
            events.add(event);
            System.out.println("Task added");
        }
    }

    public void saveToFile() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_kk_mm");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("Schedule_" + sdf.format(calendar.getTime()) + ".txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error!!! File not exist");
        }

        if (events.isEmpty()) {
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

        if (events.isEmpty()) {
            System.out.println("Schedule is empty");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
}