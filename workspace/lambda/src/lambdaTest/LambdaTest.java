package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		lambdaInter���� ���ٽ��� �ּҰ��� ����ִ� ���̴�.
		LambdaInter lambdaInter = (number) -> number%10 == 0; // LambdaInter���� ������ �޼ҵ忡 10�� �־��ְ�
//		���⼭ ������ ���ش�.(number%10 == 0;�� �ٵ��̴�.) ���ٷ� ����.
//		���� number�� �������̽����� �������� �� int������ �����߱� ������ �׳� number�� ����� ����� �� �� �ڸ��� ��Ʈ������ �־���� �ȴ�. �׷��� ������ ����
		
//		(number) �̰��� �͸� �޼ҵ��̴�. �̸��� ���� �����̴�. ���� �̰��� ���ٽ��̴�.
		boolean result = lambdaInter.checkMultipleOf10(10);
		System.out.println(result);
		
//		LambdaInter lambdaInter = number -> {
//			System.out.println("10�� ��� �˻�");
//			return number%10 == 0;
//		};
	
//		boolean result2 = lambdaInter.checkMultipleOf10(100);
//		System.out.println(result2);
	}
}