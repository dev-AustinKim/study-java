package methodTest;

public class Test {
	void change(int[] data) {	// �ּ� ���� �޾ƿ��� ���̴�.	
		data[0] = 20; //data�� �ִ� �ּҿ� ���� �ٲ� ���̴�.
	}
	
	public static void main(String[] args) {
		int[] data = {10};
		new Test().change(data); // data ��� �迭�� �ּҰ��� �����ִ� ���̴�. / new Test()�� ������ ����.
		System.out.println(data[0]); // �ּҷ� �����ؼ� �ٲ� ������ ����ϴ� ���̱� ������ data[0]�� ���� 10���� 20���� �ٲ���ִ�.
	}
}
