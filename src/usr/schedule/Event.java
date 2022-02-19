package usr.schedule;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {
    private String title;
    private Calendar eventInfo;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm");

	
	/*
	private String date;
	private String startTime;
	private String stopTime;

	*/

    public Event(String dateAndTitle) throws Exception {
        int index = dateAndTitle.indexOf(" ");
        title = dateAndTitle.substring(dateAndTitle.indexOf(" ",index + 1), dateAndTitle.length());
        String dateAndTime = dateAndTitle.substring(0, index);
        Date dateTime = sdf.parse(dateAndTitle);
        sdf.setCalendar(eventInfo);
    }

    @Override
    public String toString() {
        return "Задача: " + title +
                "\nзапланирована на " + sdf.format(eventInfo.getTime());
    }
}