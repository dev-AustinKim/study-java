package access1;

public class Access1 {
	int data1 = 10; // default
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	public Access1() { // �⺻ ������ ����Ű : �׳� Ctrl + SpaceBar + Enter
		;
	}
	
	public int getData4() { // private�� ������ ������ ������ �� �� ����ϰԲ� ���ش�. getter setter ����Ű�� Alt + Shift + S -> R ���ָ� �ȴ�.
		return this.data4;
	}
	
	public void setData4(int data4) { // getter���� ������ ������ setter�� ���� ���ϴ� ������ �����Ͽ� setter ���Ŀ� �� �� �ְ� ���ش�.
		this.data4 = data4;
	}
}


