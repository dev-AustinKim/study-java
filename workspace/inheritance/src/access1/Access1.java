package access1;

public class Access1 {
	int data1 = 10; // default
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	public Access1() { // 기본 생성자 단축키 : 그냥 Ctrl + SpaceBar + Enter
		;
	}
	
	public int getData4() { // private로 선언한 변수를 쓰려고 할 때 사용하게끔 해준다. getter setter 단축키는 Alt + Shift + S -> R 해주며 된다.
		return this.data4;
	}
	
	public void setData4(int data4) { // getter에서 가져온 변수를 setter를 통해 원하는 값으로 변경하여 setter 이후에 쓸 수 있게 해준다.
		this.data4 = data4;
	}
}


