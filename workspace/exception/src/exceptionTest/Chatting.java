package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("�޼��� : ");
		message = sc.nextLine();
		
//		if(message.contains("�ٺ�")) { // contains�� �տ� �ִ� ���ڿ�(message)���� �ڿ� �ִ� ���ڿ�(�ٺ�)�� ����ִٸ� true�� ���´�.
//			throw new BadWordException("�弳�� �ȵſ�!"); // ���ܸ� �ʵ忡 �÷��� �߻��� ��Ŵ. ������.
//		}
		
		
		// Alt + Shift + z -> ���� ���Ѱ� ��ɷ� ���ұ�?
//		Alt + Shift + z + y -> try-catch�� ����
		
		// RuntimeException�� ��ӹ��� ��
		if(message.contains("�ٺ�")) {  
				throw new BadWordException("�弳�� �ȵſ�!");

		}

		
		// Exception�� ��ӹ��� ��
//		if(message.contains("�ٺ�")) { 
//			try {
//				throw new BadWordException("�弳�� �ȵſ�!");
//			} catch (BadWordException e) {
//				System.out.println(e.getMessage());
//			}
//
//		}
	}
}