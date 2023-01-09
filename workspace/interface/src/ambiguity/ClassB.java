package ambiguity;

//public class ClassB implements InterA, InterB { // 모호성때문에 오류가 발생 -> 재정의해라. 재정의 한다면 모호성이 해결된다.
//	
//}

public class ClassB extends ClassA implements InterA/* , InterB */ {
	
	
	
//	두 개의 인터페이스 InterA와 InterB를 상속받을 때 모호성 오류가 발생.
//	모호성 해결 방법은 재정의해서 사용하면 된다!
//	@Override
//	public void printData() {
//		InterA.super.printData(); // InterA에 있는 printData()를 사용한다는 뜻.
//	}
	
	public static void main(String[] args) {
		new ClassB().printData();
	}
}


