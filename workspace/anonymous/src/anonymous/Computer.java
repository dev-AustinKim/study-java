package anonymous;

public class Computer {
	public static void main(String[] args) {
		//	Game game = new Game(); // �����ϰ� �ø���� �˷��ش�.

		//	�������̽��� �������� ���� �ʵ尡 �����ϱ� ������
		//	�͸� Ŭ������ ���� �� �������̽��� �����Ͽ� ������Ų��.
		//	������ �͸� Ŭ������ �ʵ尡 �޸𸮿� �Ҵ�� �� �������̽� Ÿ����
		//	��ü�� up casting�ȴ�.
		Game game= new Game() { // �͸�Ŭ����. �� ĳ���� / Game()�������̽��� �޸𸮿� �ö󰡴� ���� �ƴ϶� game�̶�� ���� �޸𸮿� �ö󰣴�.
			@Override
			public void play() {
				
			}
			
			@Override
			public void exit() {

			}
		};
	}
}