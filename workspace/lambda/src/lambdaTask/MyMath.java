package lambdaTask;

import java.util.Scanner;

public class MyMath { // Ctrl + Shift + / : �κ��ּ�
	public static Calc/* ����Ÿ�� */ calculator(String oper) { // +�϶� �� ���� �����ְ� -�϶� �� ���� ���ش�.
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

//	split("") => �����ڸ� �������� �迭�� �ϳ��� ��´�.
	public static void main(String[] args) { 
		OperCheck operCheck = e -> { // Opercheck�� �͸�޼ҵ带 �����Ѵ�.
			String temp = ""; // ��ȣ�� �ѹ��� ���� ���ڿ��� ����.
			for (int i = 0; i < e.length(); i++) {  // ���ڿ� ���̸�ŭ �ݺ�
				char c = e.charAt(i); // e��� ���ڿ��� i��° �ε����� �ִ� ���ڸ� c�� ����.
				if(c == '-' || c == '+') { // ���� c�� -�̰ų� +���
					temp += c; // temp��� ���ڿ��� �������ش�.
				}
			}
			return temp.split(""); //���ڱ��ڸ��� �����ؼ� �迭 �������� ��ȯ. ������ �յڷ� �� ������ �ִٸ� �� ���鵵 �迭�� ����. �� �հ� �� �ڴ� ���Ǳ�� Ȯ������.
		};

		String message = "������ ����, ������ ���� ���� �Է��ϼ���.";
		String exampleMessage = "��)9+7-5";
		String expression = null;
		String[] opers = null, numbers = null;
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(exampleMessage);
		expression = sc.nextLine(); // �Է¹ޱ� expression = ���� �Է��� ��.
		expression = expression.trim(); // �� �� ���� ����
		expression = expression.replaceAll(" ", ""); // ���� ���� ����

		opers = operCheck.getOpers(expression); // 1+3+5  B�� �����ڷ� �Ѵٸ� : ABABCB -> A,A,C,"" 
		numbers = expression.split("\\+|\\-"); // \\�� +�� -�� ���ڷ� �ν��ϰ� ���ش�.

//		numbers[0].equals("") -> �� ù�ڸ��� �������� ������.
//		opers[0] + numbers[1] -> �� ù�ڸ��� ������ oper�� ��� ���̳ʽ��� numbers[1]�� �ٿ��ش�.
//		Integer.parseInt -5�� ���ڿ��� ����Ǿ��ִ� ���±� ������ ������������ ���� ���̴�.
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]); 
		
//		-5+2-5
		for(int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;} // ù ������ ������ ��� �̹� ����� �� �����̱� ������ �ι�° �������� ����ϵ��� continue�� ����.
			number2 = Integer.parseInt(numbers[i + 1]); // ù ������ ������ �׳� ����.
			number1= MyMath.calculator(opers[i]).calc(number1, number2); // oper(������)�� ���� ����� �ؼ� number1�� �ٽ� ��´�.(���Ұ� �����ְ� ���ٰ� ���ش�.)
		}
			
		System.out.println(number1); // �ݺ��� ������ ���� number1 ���
	}
}