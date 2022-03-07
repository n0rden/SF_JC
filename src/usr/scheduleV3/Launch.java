package usr.scheduleV3;

import java.text.ParseException;
import java.util.Scanner;

public class Launch {

    public static final String SHOW = "show - to output a schedule to the console";
    public static final String SAVE = "save - to save to a file (example path: C:\\Test\\Schedule.txt)";
    public static final String HELP = "help - to output program control commands";
    public static final String EXIT = "exit - to exit the program";

    static public void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        ScheduleV3 schedule = new ScheduleV3();

        System.out.println("-=| Scheduler |=-\n\n" +
                "Enter the task in the format date, time and name of the task\n" +
                "(example: 23.10.2021 10:00 Dentist)");

        help();

        System.out.print("Input task: ");
        String str = sc.nextLine();

        while (!str.equals("exit")) {
            if (str.equals("show")) schedule.show();
            else if (str.equals("save")) schedule.saveToFile();
            else if (str.equals("help")) help();
            else {
                try {
                    schedule.addEvent(new Event(str));
                } catch (ParseException e) {
                    System.out.println("Error!!! Incorrect input data.");
                    System.out.println(e.getMessage());
                    System.out.println("Pleace try again (example: 23.10.2021 10:00 Dentist)");
                }
            }
            str = sc.nextLine();
        }
        sc.close();
    }

    public static void help() {
        System.out.println("Program control commands:");
        System.out.println(SHOW);
        System.out.println(SAVE);
        System.out.println(HELP);
        System.out.println(EXIT);
    }
}