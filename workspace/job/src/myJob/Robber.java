package myJob;

import java.util.Random;
import java.util.Scanner;

class RobberId { // ������ �ѹ��� ����� : Alt + Shift + S �Ŀ� Alt + Shift + O
	String name;
	static int totalMoney; // ��ü ��.
	static {
		totalMoney = 0;
	}

	public RobberId(String name){ //
		this.name = name;
	}

	// ��뿡 ���� ���� Ȯ���� �޶���.
	boolean percent(int data) {
		Random random = new Random();
		int[] rating = new int[10];
		boolean check = false;

		for (int i = 0; i < data / 10; i++) {
			rating[i] = 1;
		}
		if(rating[random.nextInt(10)] == 1) {
			check = true; // true�� �ٲ���.
		}
		return check; // false�� ����.
	}
}

// ���� 7ȸ �̻� ���� �� �����ν��� �ڰ�X

public class Robber {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String name = "";
		int choice = 0, failcount = 0, level = 0;
		boolean flag = false;
		
			
		System.out.print("������� �̸��� �Է��ϼ���. \n�̸� : ");
		name = sc.nextLine();

		RobberId robber = new RobberId(name);

		String message = "��ĥ ���� ���� �����ϼ���.\n1.100����(������: 70%)\n2.1000����(������: 40%)\n3.6000����(������: 30%)\n4.1��(������: 10%)";

		while(true) {
			System.out.println(message);
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("100������ �����ϼ̽��ϴ�.");
			if(robber.percent(70)==false) { 
				System.out.println("��ġ�� ���ФФ�, ������~");
				failcount++;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
			} else {
				System.out.println("��ġ�� ����, ���ִ�..!");
				robber.totalMoney += 100;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
			}

			break;

			case 2 : System.out.println("1000������ �����ϼ̽��ϴ�.");
			if(robber.percent(40)==false) { 
				System.out.println("��ġ�� ���ФФ�, ������~");
				failcount++;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
			} else {
				System.out.println("��ġ�� ����, ���ִ�..!");
				robber.totalMoney += 1000;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
				if(robber.totalMoney==10000) {
				}
			}
			break;

			case 3 : System.out.println("6000������ �����ϼ̽��ϴ�.");
			if(robber.percent(30)==false) { 
				System.out.println("��ġ�� ���ФФ�, ������~");
				failcount++;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
			} else {
				System.out.println("��ġ�� ����, ���ִ�..!");
				robber.totalMoney += 6000;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
			}
			break;

			case 4 : System.out.println("1����� �����ϼ̽��ϴ�.");
			if(robber.percent(10)==false) { 
				System.out.println("��ġ�� ���ФФ�, ������~");
				failcount++;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney+ "\n�� ���� Ƚ�� : " + failcount);
			} else {
				System.out.println("��ġ�� ����, ���ִ�..!");
				robber.totalMoney += 10000;
				System.out.println(robber.name + "���� �� ��ģ �� : " + robber.totalMoney + "\n�� ���� Ƚ�� : " + failcount);
			}

			break;

			default :
				System.out.println("���� ��ȣ�Դϴ�. �ٽ� �����ϼ���.");
			}
			if(failcount>6) { // 7ȸ�̻� ���н� ����.
//				flag = false;
				if(!flag) { 
					System.out.println("�̷� �Ƿ����� �����Ҳ��� �׳� �����ϰ� ��ƶ�~");
					break;
				}
			}
		}
	}
}