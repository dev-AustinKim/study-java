package controlStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//		브론즈
		//		1~100까지 출력
		//		100~1까지 출력
		//		1~100까지 중 짝수만 출력

		//		실버
		//		1~10까지 합 출력
		//		1~n까지 합 출력
		//		골드
		//		A~F까지 출력
		//		A~F까지 중 C제외하고 출력

		//		다이아
		//		0 1 2 3 0 1 2 3 0 1 2 3 출력
		//		aBcDeFgH..Z 출력

		// 브론즈
		char alpha = 'A';
		System.out.print("1~100까지 출력 : ");
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("100~1까지 출력");
		for(int i=100; i>=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("1~100까지 중 짝수만 출력 : ");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}	
		}
		//		강사님 버전
		//		for(int i=0; i<50; i++) {
		//			System.out.println((i + 1) *2);
		//		}
		System.out.println();

		// 실버
		System.out.print("1~10까지 합 출력 : ");
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		System.out.println(result);
		result = 0;
		System.out.println("1~n까지 합 출력");
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			result += i;
		}
		System.out.println(result);
		result = 0;

		// 골드
		System.out.print("A~F까지 출력 : ");
		for(int i=1; i<=6; i++) {
			System.out.print(alpha + " ");
			alpha++;
		}
		//		강사님 버전
		//		for(int i = 0; i < 6, i ++) {
		//			System.out.println((char)(i+65));
		//		}

//		강사님 버전
		System.out.print("\nA~F까지 중 C 제외하고 출력 : ");
		for (int i = 0; i < 5; i++) {
			System.out.println((char)(i > 1 ? i + 66 : i + 65));
		}



		//		다이아
		System.out.print("\n0 1 2 3 출력 : ");
		for(int i = 1; i <=3; i++) {
			for(int j = 0; j <=3; j++) {
				System.out.print(j + " ");
			}
		}
		// 강사님 버전
		for(int i = 0; i < 12; i++) {
			System.out.print(i%4 + "");
		}

		//강사님 버전
		System.out.print("\naBcD.. 출력 : ");
		for(int i = 0; i < 26; i++) {
			System.out.println((char)(i%2 == 0 ? i + 97 : i + 65));
		}
	}
}
