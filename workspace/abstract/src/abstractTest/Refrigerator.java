package abstractTest;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		System.out.println("����� ���� �ѱ�");
	}

	@Override
	public void off() {
		System.out.println("����� ���� ����");
	}
}