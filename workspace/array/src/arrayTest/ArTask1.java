package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		//	�����
		//	1~10���� �迭�� ��� ���
		int[] arDataB1 = new int[10];
		for (int i = 0; i < arDataB1.length; i++) {
			arDataB1[i] = i + 1;
			System.out.print(arDataB1[i] + " ");
		}
		System.out.println();
		//	10~1���� �� ¦���� �迭�� ��� ��� �ٽ��ϱ�. ##############
		int[] arDataB2 = new int[10];

		for (int i = 0; i < 10; i++) {
			arDataB2[i] = 10-i*2;
		}
		for(int i = 0; i <5; i++) {
			System.out.print(arDataB2[i] + " ");
		}
		System.out.println();
//      10~1���� �� ¦���� �迭�� ��� ��� ����� ����.
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = 10 - i * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

		//	1~100���� �迭�� ���� �� Ȧ���� ���
		//		
		int[] arDataB3 = new int[100];

		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				arDataB3[i] = i + 1;
				System.out.print(arDataB3[i] + " ");
			}
		}
		System.out.println();
		//	�ǹ�
		//	1~100���� �迭�� ���� �� ¦���� �� ���
		int[] arDataS1 = new int[100];
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if(i%2!=0) {
				arDataS1[i] = i + 1;
				sum += arDataS1[i];
			}
		}
		System.out.print(sum + " ");
		System.out.println();
//		//	A~F���� �迭�� ��� ���
		char[] arDataS2 = new char[7];
		for(int i = 0; i < 6; i ++) {
			arDataS2[i] = (char)(i+65);
			System.out.print(arDataS2[i] + " ");
		}
		System.out.println();

		//	A~F���� �� C�����ϰ� �迭�� ���� �� ���
		//	A = 65
		char[] arDataS3 = new char[6];

		for (int i = 0; i < 6; i++) {
			arDataS3[i] = (char)(i+65);
			if(i==2) {
				continue;
			}
			System.out.print(arDataS3[i] + " ");
		}
		System.out.println();
//		���
//		5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//			
		int num = 0, max = 0, min = 0, temp = 0;
		int[] arDataG = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			arDataG[i] = num;
		} 
		
		for(int j = 0; j<arDataG.length; j++) {
			min = arDataG[0];
			if(min>arDataG[j]) {
				arDataG[j] = temp;
				min = arDataG[j];
				arDataG[j] = temp;
			}
			max = arDataG[4];
			min = arDataG[0];
		}
		System.out.println("�ִ� �� : " + max + ", �ּ� �� : " + min);
		
		//		���̾�
		//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		int choice = 0, Dsum = 0, Dnum = 0, result = 0;
		System.out.print("�迭�� ũ�⸦ �����ּ���.");
		choice = sc.nextInt();
		int[] arDataD = new int[choice];
		for (int i = 0; i < arDataD.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			Dnum = sc.nextInt();
			arDataD[i] = Dnum;
			Dsum += arDataD[i];
		}
		result = Dsum/choice;
		System.out.println("����� : " + (double)result);
	}
}
