package abstractTest;


// 모든 클래스는 다 추상적이다. BUT abstract를 붙이는 이유는 필드 안에 추상 메소드를 선언할 것이라는 표시이다.
public abstract class Electronics { // 필드 안에 추상 메소드를 만들것이다.라는 선언
	// 추상 클래스는 일반 메소드도 선언이 가능하기 때문에 그냥 선언하면 일반메소드로 오해할 수도 있어서 항상 추상 메소드에는 abstract를 붙여줘야 한다.
	public abstract void on(); // 구현이 안된 상태. 자식이 받아서 재정의를 하여 사용해야 한다.
	public abstract void off(); // 구현이 안된 상태. 자식이 받아서 재정의를 하여 사용해야 한다.
}


