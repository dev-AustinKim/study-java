package lambdaTask;

import java.util.Scanner;

public class MyMath { // Ctrl + Shift + / : 부분주석
	public static Calc/* 리턴타입 */ calculator(String oper) { // +일때 두 수를 더해주고 -일때 두 수를 뺴준다.
		Calc calc = null;
		switch(oper) {
		case "+":
			calc = (n1, n2) -> n1 + n2;
			break;
		case "-":
			calc = (n1, n2) -> n1 - n2;
			break;
		}
		return calc;
	}

//	split("") => 구분자를 기준으로 배열에 하나씩 담는다.
	public static void main(String[] args) { 
		OperCheck operCheck = e -> { // Opercheck의 익명메소드를 구현한다.
			String temp = ""; // 부호를 한번에 넣을 문자열을 생성.
			for (int i = 0; i < e.length(); i++) {  // 문자열 길이만큼 반복
				char c = e.charAt(i); // e라는 문자열의 i번째 인덱스에 있는 문자를 c에 담음.
				if(c == '-' || c == '+') { // 만약 c가 -이거나 +라면
					temp += c; // temp라는 문자열에 연결해준다.
				}
			}
			return temp.split(""); //글자글자마다 구분해서 배열 형식으로 반환. 구분자 앞뒤로 빈 공백이 있다면 빈 공백도 배열에 들어간다. 맨 앞과 맨 뒤는 주의깊게 확인하자.
		};

		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String exampleMessage = "예)9+7-5";
		String expression = null;
		String[] opers = null, numbers = null;
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(exampleMessage);
		expression = sc.nextLine(); // 입력받기 expression = 내가 입력한 값.
		expression = expression.trim(); // 앞 뒤 공백 제거
		expression = expression.replaceAll(" ", ""); // 사이 공백 제거

		opers = operCheck.getOpers(expression); // 1+3+5  B를 구분자로 한다면 : ABABCB -> A,A,C,"" 
		numbers = expression.split("\\+|\\-"); // \\는 +와 -를 문자로 인식하게 해준다.

//		numbers[0].equals("") -> 맨 첫자리가 음수인지 구분함.
//		opers[0] + numbers[1] -> 맨 첫자리가 음수면 oper에 담긴 마이너스를 numbers[1]에 붙여준다.
//		Integer.parseInt -5가 문자열로 연결되어있는 상태기 때문에 정수형식으로 해준 것이다.
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]); 
		
//		-5+2-5
		for(int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;} // 첫 정수가 음수인 경우 이미 계산이 된 상태이기 때문에 두번째 정수부터 계산하도록 continue를 해줌.
			number2 = Integer.parseInt(numbers[i + 1]); // 첫 정수가 양수라면 그냥 실행.
			number1= MyMath.calculator(opers[i]).calc(number1, number2); // oper(연산자)에 따라서 계산을 해서 number1에 다시 담는다.(더할거 더해주고 빼줄거 빼준다.)
		}
			
		System.out.println(number1); // 반복문 끝나고 담은 number1 출력
	}
}