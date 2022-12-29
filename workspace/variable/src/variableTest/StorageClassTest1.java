package variableTest;

public class StorageClassTest1 {
	int data = 10;
	static int data_s = 10; // static을 붙이면 가장 먼저 할당된다.
	
	void increaseData() {
		System.out.println(++data);
	}
	
	static void increaseData_s() {
		System.out.println(++data_s);
	}
	
}
