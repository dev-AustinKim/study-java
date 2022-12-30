package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "큰 값 : " + num1;
		} else if(num1 < num2) {
			result = "큰 값 : " + num2;
		} else {
			result = "두 수가 같습니다.";
		}
		System.out.println(result);
	}
}