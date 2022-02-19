package usr.schedule;

import java.util.Scanner;

public  class Launch {
	
	static public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-= Планировщик задач =-\n\n" +
				"Введите задачу в формате дата, время (в промежутке между 06:00 и 19:00)\n" +
				"и название задачи (пример: 23-10-2021 10:00-12:00 Стоматолог), \n" +
				"если в этот день в расписании указанное время свободно, задача добавится, \n" +
				"если нет, то программа выдаст уведомление, что время занято.\n");
		
		System.out.println("Комманды управления программой:\n" + 
				"show - для вывода в консоль расписания\n" +
				"save - для сохранения в файл (пример пути: C:\\Test\\Schedule.txt)\n" + 
				"help - для вывода комманд управления программой\n" + 
				"exit - для выхода из программы\n");
		
		System.out.print("Введите задачу: ");
		
		while(!sc.nextLine().equals("exit")) {
			System.out.println("Hello!");
			
		}
		
		sc.close();
		
	}

}
