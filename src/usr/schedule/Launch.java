package usr.schedule;

import java.util.Scanner;

public  class Launch {
	
	static public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-= ����������� ����� =-\n\n" +
				"������� ������ � ������� ����, ����� (� ���������� ����� 06:00 � 19:00)\n" +
				"� �������� ������ (������: 23-10-2021 10:00-12:00 ����������), \n" +
				"���� � ���� ���� � ���������� ��������� ����� ��������, ������ ���������, \n" +
				"���� ���, �� ��������� ������ �����������, ��� ����� ������.\n");
		
		System.out.println("�������� ���������� ����������:\n" + 
				"show - ��� ������ � ������� ����������\n" +
				"save - ��� ���������� � ���� (������ ����: C:\\Test\\Schedule.txt)\n" + 
				"help - ��� ������ ������� ���������� ����������\n" + 
				"exit - ��� ������ �� ���������\n");
		
		System.out.print("������� ������: ");
		
		while(!sc.nextLine().equals("exit")) {
			System.out.println("Hello!");
			
		}
		
		sc.close();
		
	}

}
