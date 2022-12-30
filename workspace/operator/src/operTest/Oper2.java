package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 대소비교
		int num1 = 0, num2 = 0;
		String result = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "큰 값 : " + num1
				: num1==num2 ? "두 수는 같습니다." : "큰 값 : " + num2;
		System.out.println(result);
	}
}