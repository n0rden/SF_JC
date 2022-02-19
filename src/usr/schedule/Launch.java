package usr.schedule;

import java.util.Scanner;

public  class Launch {
	
	static public void start() throws Exception {
		Scanner sc = new Scanner(System.in);
		Schedule schedule = new Schedule();
		
		System.out.println("-= ����������� ����� =-\n\n" +
				"������� ������ � ������� ����, ����� (� ���������� ����� 06:00 � 19:00)\n" +
				"� �������� ������ (������: 23-10-2021 10:00 ����������), \n" +
				"���� � ���� ���� � ���������� ��������� ����� ��������, ������ ���������, \n" +
				"���� ���, �� ��������� ������ �����������, ��� ����� ������.\n");
		
		System.out.println("�������� ���������� ����������:\n" + 
				"show - ��� ������ � ������� ����������\n" +
				"save - ��� ���������� � ���� (������ ����: C:\\Test\\Schedule.txt)\n" + 
				"help - ��� ������ ������� ���������� ����������\n" + 
				"exit - ��� ������ �� ���������\n");
		
		System.out.print("������� ������: ");
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
