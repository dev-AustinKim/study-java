package apiTest;

public class API_TEST {
	public static void main(String[] args) {
		Calc calc = new Calc();
		try {
			System.out.println(calc.div(1, 0));
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
