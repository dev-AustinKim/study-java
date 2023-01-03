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
//	컴파일러가 가장 먼저 메모리에 할당해준다.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//	1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리로 올려준다.
//	2.일반 메소드의 소속을 알려준다.
	
	public static void main(String[] args) { // static 선언 시 메모리의 가장 상단에 위치하기 때문에 multiple이라는 것이 메모리에 없어서 오류가 난다.
		MethodTest methodTest = new MethodTest();
		methodTest.multiple(1,3);
	}
}
