package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		//		사용자에게 키를 입력받고
		//		정수라면 정수로 출력
		//		실수라면 실수로 출력
		//		예 ) 183 -> 183출력
		//			183.5 -> 183.5 출력
		//		삼항 연산자를 사용!
		//		힌트! 뺼셈으로 풀면 쉬움. 서식문자로 풀면 더 쉬움.
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예) 183 -> 183 출력
//			183.5 -> 183.5 출력
		
		
//		삼항 연산자를 사용!
		// 1번째
		double num = 0;	// 입력을 받을 변수. 입력받은 값의 범위가 넓은 실수로 선언
		boolean tof = false;	// 정수/실수 여부를 저장할 변수
		String result = null;	// 서식문자를 포함하는, 출력할 문자열 메시지를 담을 변수
		
		Scanner sc = new Scanner(System.in);	// 스캐너 선언
//		입력 안내를 위한 메시지 출력
		System.out.println("정수/실수 판별기입니다.\n숫자를 입력해주세요.");
		System.out.print("입력 : ");
		num = sc.nextDouble();	// 입력값을 변수에 담음.
		
		tof = num - (int)num == 0;	// 실수 - 정수의 값이 0이라면 true가 나오고 정수라는 걸 알 수 있음.
		result = tof ? "결과(정수) : %.0f" : "결과(실수) : %.1f";	// 위 조건식을 사용해 조건에 따라 서식문자를 다르게 적용
		
//		System.out.printf(result, tof ? (int)num : num);	// 어차피 %f를 사용할 실수이므로 파라미터에서는 삼항연산자를 사용할 필요가 없음.
		System.out.printf(result, num);
//		sc.close();
		
////		강사님 버전
//		double height = 0.0;
//		String message = "키 : 0";
////		Scanner sc = new Scanner(System.in);
//		boolean check = false; // boolean형의 초기화 값은 false이다.
//		String format = null;
//		String forLength = "";
//		int length = 0;
//
//		System.out.println(message);
//		height = sc.nextDouble();
//		check = height - (int)height == 0;
//		forLength = height - (int)height + "";
//
//		length = forLength.length() > 8 ? 8 : forLength.length();
//		
//		// 삼항연산자는 연산 후 결과를 한 변수에 담아서 출력할 때 그 변수만 출력해서 결과가 나오게 한다.
//		format = check ? "%.0fcm" : "%." + (forLength.length()-2) + "fcm"; // 삼항연산자도 연산자라 정수 + 실수 연산을 하면 실수로 결과가 나온다.
//		System.out.printf(format, height);
	}
}