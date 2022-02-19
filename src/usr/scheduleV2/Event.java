package usr.scheduleV2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Event {
    private String title;
    private Calendar evenStart;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm");

    public Event(String dateAndTitle) throws Exception {
        evenStart = Calendar.getInstance();
        int index = dateAndTitle.indexOf(" ");
        title = dateAndTitle.substring(dateAndTitle.indexOf(" ",index + 1) + 1);
        Date dateTime = sdf.parse(dateAndTitle);
        evenStart.setTime(dateTime);
    }

    @Override
    public String toString() {
        return "������: " + title +
                "\n������������� ��: " + sdf.format(evenStart.getTime()) +
                "\n";
    }
}