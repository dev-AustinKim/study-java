package arrayTest;

import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		//	브론즈
		//	1~10까지 배열에 담고 출력
		int[] arDataB1 = new int[10];
		for (int i = 0; i < arDataB1.length; i++) {
			arDataB1[i] = i + 1;
			System.out.print(arDataB1[i] + " ");
		}
		System.out.println();
		//	10~1까지 중 짝수만 배열에 담고 출력 다시하기. ##############
		int[] arDataB2 = new int[10];

		for (int i = 0; i < 10; i++) {
			arDataB2[i] = 10-i*2;
		}
		for(int i = 0; i <5; i++) {
			System.out.print(arDataB2[i] + " ");
		}
		System.out.println();
//      10~1까지 중 짝수만 배열에 담고 출력 강사님 버전.
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = 10 - i * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

		//	1~100까지 배열에 담은 후 홀수만 출력
		//		
		int[] arDataB3 = new int[100];

		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				arDataB3[i] = i + 1;
				System.out.print(arDataB3[i] + " ");
			}
		}
		System.out.println();
		//	실버
		//	1~100까지 배열에 담은 후 짝수의 합 출력
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
//		//	A~F까지 배열에 담고 출력
		char[] arDataS2 = new char[7];
		for(int i = 0; i < 6; i ++) {
			arDataS2[i] = (char)(i+65);
			System.out.print(arDataS2[i] + " ");
		}
		System.out.println();

		//	A~F까지 중 C제외하고 배열에 담은 후 출력
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
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//			
		int num = 0, max = 0, min = 0, temp = 0;
		int[] arDataG = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("정수 입력 : ");
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
		System.out.println("최대 값 : " + max + ", 최소 값 : " + min);
		
		//		다이아
		//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		int choice = 0, Dsum = 0, Dnum = 0, result = 0;
		System.out.print("배열의 크기를 정해주세요.");
		choice = sc.nextInt();
		int[] arDataD = new int[choice];
		for (int i = 0; i < arDataD.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			Dnum = sc.nextInt();
			arDataD[i] = Dnum;
			Dsum += arDataD[i];
		}
		result = Dsum/choice;
		System.out.println("평균은 : " + (double)result);
	}
}
