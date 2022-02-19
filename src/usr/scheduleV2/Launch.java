package usr.scheduleV2;

import java.util.Scanner;

public class Launch {

    static public void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        ScheduleV2 schedule = new ScheduleV2();

        System.out.println("\n-= Планировщик задач =-\n\n" +
                "Введите задачу в формате дата, время и название задачи\n" +
                "(пример: 23-10-2021 10:00 Стоматолог)");

        help();

        System.out.print("Введите задачу: ");
        String str = sc.nextLine();

        while (!str.equals("exit")) {
            if (str.equals("show")) schedule.show();
            else if (str.equals("save")) schedule.saveToFile();
            else if (str.equals("help")) help();
            else schedule.addEvent(new Event(str));
            str = sc.nextLine();
        }
        sc.close();
    }

    public static void help() {
        System.out.println("\nКомманды управления программой:\n" +
                "show - для вывода в консоль расписания\n" +
                "save - для сохранения в файл (в папку проекта)\n" +
                "open - для открытия файла расписания (из папки проекта)\n" +
                "help - для вывода комманд управления программой\n" +
                "exit - для выхода из программы\n");
    }
}
