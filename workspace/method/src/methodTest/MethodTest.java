package methodTest;

public class MethodTest {
	int multiple(int number1, int number2) {
		int result = number1 * number2;
		return result;
	}
	
	void test() {
		int result = multiple(1,3);
		result += 9;
	}
	
//	static
//	�����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//	�Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ��� �Ʒ��� �� ���� ����� �����Ѵ�.
//	1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮷� �÷��ش�.
//	2.�Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�.
	
	public static void main(String[] args) { // static ���� �� �޸��� ���� ��ܿ� ��ġ�ϱ� ������ multiple�̶�� ���� �޸𸮿� ��� ������ ����.
		MethodTest methodTest = new MethodTest();
		methodTest.multiple(1,3);
	}
}
