package classTest;

class A { // 이 안에 있는 것은 전부 필드
	int data; // 클래스에 선언된 변수는 전역변수이고, 전역변수는 자동초기화가 된다. 4번째 줄의 data는 전역변수.
	
	A(int data) { // 기본 생성자. 6번째 줄의 data는 매개변수.
		System.out.println("기본 생성자");
		// 지역변수는 자기 안에 선언된 변수가 우선이다. (지역변수 안에서는 우선순위 : 지역변수 > 전역변수)
		this.data = data; // ※ this는 이 필드에 접근한 객체가 가지고 있는 주소 값을 받는다.
	}
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A(20); // 클래스를 선언하면 자동으로 선언이 된다. -> 기본 생성자. / a= 기본 생성자.
		A a2 = new A(10);
//		System.out.println(a); // a의 주소값 출력
//		System.out.println(a.data);
//		a.data = 20; // 필드의 주소 값으로 접근
		a.printData();
		a2.printData();
		
	}
}
