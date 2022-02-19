package usr.schedule;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Event {
    private String title;
    private Calendar evenStart;
    private Calendar evenStop;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm");

    public Event(String dateAndTitle) throws Exception {
        evenStart = Calendar.getInstance();
        evenStop = Calendar.getInstance();
        int index = dateAndTitle.indexOf(" ");
        title = dateAndTitle.substring(dateAndTitle.indexOf(" ",index + 1) + 1, dateAndTitle.length());
        String dateAndTime = dateAndTitle.substring(0, index);
        Date dateTime = sdf.parse(dateAndTitle);
        sdf.setCalendar(evenStart);

        System.out.println(sdf.format(evenStart.getTime()));
    }

    @Override
    public String toString() {
        return "Задача: " + title +
                "\nЗапланирована на: " + sdf.format(evenStart.getTime());
    }
}