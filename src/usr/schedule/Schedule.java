package usr.schedule;

import java.io.File;
import java.util.ArrayList;

public class Schedule {
	
	File file;	
	ArrayList<Event> events;
	
	public void addEvent(Event event) {
		events.add(event);
	}
	
	@Override
	public String toString() {
		return null;
	}
	
	public static void saveToFile() {
		
	}
}
