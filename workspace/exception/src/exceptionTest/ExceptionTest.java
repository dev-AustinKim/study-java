package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {			
			System.out.println(10/0);
			System.out.println("���� ����");
		} catch(ArithmeticException e) {
//			e.printStackTrace(); // ������ �� ������ �������ش�. catch������ ����� ����. �������� �� ���� �ƴ�. ��Ȯ�ϰ� ���° �ٿ��� ������ ������ Ȯ��. -> ����
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println(e.getMessage()); // ���� �޼��� ���.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
