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

        String dateAndTime = dateAndTitle.substring(0, dateAndTitle.indexOf(" "));
        Date dateTime = sdf.parse(dateAndTitle);
		
		/*
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.title = title;
		*/
    }
}