package ambiguity;

//public class ClassB implements InterA, InterB { // ��ȣ�������� ������ �߻� -> �������ض�. ������ �Ѵٸ� ��ȣ���� �ذ�ȴ�.
//	
//}

public class ClassB extends ClassA implements InterA/* , InterB */ {
	
	
	
//	�� ���� �������̽� InterA�� InterB�� ��ӹ��� �� ��ȣ�� ������ �߻�.
//	��ȣ�� �ذ� ����� �������ؼ� ����ϸ� �ȴ�!
//	@Override
//	public void printData() {
//		InterA.super.printData(); // InterA�� �ִ� printData()�� ����Ѵٴ� ��.
//	}
	
	public static void main(String[] args) {
		new ClassB().printData();
	}
}


