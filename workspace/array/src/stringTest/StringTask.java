package stringTest;

import java.util.Scanner;

// ȥ�� �ٽ��غ���.
public class StringTask {
	public static void main(String[] args) {
		//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
		//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
		// null �϶��� �ؿ��� ������ �� �� ����ϴ� ���̰�, 
		// ""�� ���������� �� �� ����Ѵ�.
		// null�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��. ex) data = �ȳ�;
		// ""�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
		String inter = null;
		String result = "";
		System.out.print("���ڿ��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		inter = sc.nextLine();
		for(int i = 0; i < inter.length(); i++) {
			if(inter.charAt(i)>=97 && inter.charAt(i)<=122) {
				result += (char)(inter.charAt(i)-32); // �ҹ����� ���.
			} else if(inter.charAt(i)>=65 && inter.charAt(i)<=90){ // �ٸ� Ư����ȣ�� ���� ���� ������ else�� �ƴ� else if�� �ؾ��Ѵ�.
				result += (char)(inter.charAt(i)+32);
			}
		}
		System.out.println(result);
		//		������ �ѱ۷� ����
		//		��)1024 -> �ϰ��̻�
//		System.out.print("������ �ѱ۷� ����, ������ �Է��ϼ��� : ");
//		String num = sc.nextLine();
//		for(int i = 0; i < num.length(); i++) {
//			switch(num.charAt(i)) {
//			case '0' : System.out.print("��");
//			break;
//			case '1' : System.out.print("��");
//			break;
//			case '2' : System.out.print("��");
//			break;
//			case '3' : System.out.print("��");
//			break;
//			case '4' : System.out.print("��");
//			break;
//			case '5' : System.out.print("��");
//			break;
//			case '6' : System.out.print("��");
//			break;
//			case '7' : System.out.print("ĥ");
//			break;
//			case '8' : System.out.print("��");
//			break;
//			case '9' : System.out.print("��");
//			break;	
//			// default ����.
//			}
//		}
		// ����� ���� ���� ����
//		String message = "���� : " , result = "";
//		String hangle = "�����̻�����ĥ�ȱ�";
//		Scanner sc = new Scanner(System.in);
//		int number = 0;
//		System.out.println(message);
//		number = sc.nextInt();
//		while(number != 0) {
//			result = hangle.charAt(number)%10 +result;
//			number /= 10;
//		}
//		System.out.println(result);
		
		// ����� ���� ���ڿ� ����
//		String message = "���� : " , result = "";
//		String hangle = "�����̻�����ĥ�ȱ�";
//		Scanner sc = new Scanner(System.in);
//		String data = null;
//		System.out.print(message);
//	      data = sc.next();
//	      
//	      for (int i = 0; i < data.length(); i++) {
//	         result += hangle.charAt(data.charAt(i) - 48);
//	      }   
//	      System.out.println(result);
		
	}
}