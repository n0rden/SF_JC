package usr.schedule;

import java.util.Scanner;

public  class Launch {
	
	static public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		Schedule schedule = new Schedule();
		
		System.out.println("-= Планировщик задач =-\n\n" +
				"Введите задачу в формате дата, время (в промежутке между 06:00 и 19:00)\n" +
				"и название задачи (пример: 23-10-2021 10:00 Стоматолог), \n" +
				"если в этот день в расписании указанное время свободно, задача добавится, \n" +
				"если нет, то программа выдаст уведомление, что время занято.\n");
		
		System.out.println("Комманды управления программой:\n" + 
				"show - для вывода в консоль расписания\n" +
				"save - для сохранения в файл (пример пути: C:\\Test\\Schedule.txt)\n" + 
				"help - для вывода комманд управления программой\n" + 
				"exit - для выхода из программы\n");
		
		System.out.print("Введите задачу: ");
		String str = sc.nextLine();

		while(!str.equals("exit")) {
			if (str.equals("show")) schedule.show();
			else if (str.equals("save")) schedule.saveToFile();
			else if(str.equals("help")) schedule.help();
			else schedule.addEvent(new Event(str));
			str = sc.nextLine();
		}
		
		sc.close();
		
	}

}
