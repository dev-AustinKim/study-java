package classTest;

class A { // �� �ȿ� �ִ� ���� ���� �ʵ�
	int data; // Ŭ������ ����� ������ ���������̰�, ���������� �ڵ��ʱ�ȭ�� �ȴ�. 4��° ���� data�� ��������.
	
	A(int data) { // �⺻ ������. 6��° ���� data�� �Ű�����.
		System.out.println("�⺻ ������");
		// ���������� �ڱ� �ȿ� ����� ������ �켱�̴�. (�������� �ȿ����� �켱���� : �������� > ��������)
		this.data = data; // �� this�� �� �ʵ忡 ������ ��ü�� ������ �ִ� �ּ� ���� �޴´�.
	}
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A(20); // Ŭ������ �����ϸ� �ڵ����� ������ �ȴ�. -> �⺻ ������. / a= �⺻ ������.
		A a2 = new A(10);
//		System.out.println(a); // a�� �ּҰ� ���
//		System.out.println(a.data);
//		a.data = 20; // �ʵ��� �ּ� ������ ����
		a.printData();
		a2.printData();
		
	}
}
