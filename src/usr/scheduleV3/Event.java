package usr.scheduleV3;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Event implements Comparable<Event>{
    private String title;
    private Calendar evenStart;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy kk:mm");

    public Event(String dateAndTitle) throws ParseException {
        evenStart = Calendar.getInstance();
        int index = dateAndTitle.indexOf(" ");
        title = dateAndTitle.substring(dateAndTitle.indexOf(" ",index + 1) + 1);
        Date dateTime = sdf.parse(dateAndTitle);
        evenStart.setTime(dateTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return evenStart == event.evenStart &&
                title.equals(event.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evenStart);
    }

    @Override
    public String toString() {
        return "Task: " + title +
                "\nScheduled for: " + sdf.format(evenStart.getTime()) +
                "\n";
    }

    @Override
    public int compareTo(Event o) {
        return evenStart.compareTo(o.evenStart);
    }
}