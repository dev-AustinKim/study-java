package interfaceTest;

// �����ڸ� �굵 �θ�.
public interface Pet {
	public int EYES = 2; // �̸� ���س��� ���̴�. �������̽��� ����ۿ� ������ �ȵǴϱ� final static�� int �տ� ������ �Ǿ� �ִ� ���̴�. static�� ���̴� ���� : ��� ��ü�� �����ϱ� ���ؼ�.
	public final static int NOSE = 1; // ���ٰ� ���� �����̴�.
	
	public void giveYourHand(); // �������̽��� �߻�޼ҵ�ۿ� ����� �� �����ϱ� abstract�� �����Ǿ� �ִ�.
	public abstract void bang(); // ���ٰ� ���� �����̴�.
	public void sitDown();
	public void waitNow();
	public void getNose();
}