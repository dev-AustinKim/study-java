package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	public Car() {;} // 일부러 비워놓은 거니까 코드 작성하지 말라는 표시.
	
	public Car(String brand, String color, int price) { // Alt + Shift + S 다음에 영어 O 누르면 된다.	
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

class SuperCar extends Car{ // 자식의 기본 생성자는 무조건 부모의 기본 생성자만 부른다. 따라서 부모에 기본 생성자가 없다면 자식에도 기본 생성자 말고 부모와 똑같은 생성자를 하나 만들어줘야한다.
	String mode;
	
	public SuperCar(String brand, String color, int price, String mode) {
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//		위에 3개를 부모 생성자의 호출로 한번에 초기화할 수 있다.
		super(brand,color,price); // Alt + Shift + S -> O -> super를 상속받아서 초기화 해주면 된다.
		this.mode = mode;
	}
	
//	슈퍼카는 음성으로 시동을 켜고 끌 수 있다.
	@Override // 대충쓰고 Ctrl + SpaceBar 하면 오버라이딩 자동으로 만들어짐.
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 55000, "Sport");
		ferrari.engineStart();
		ferrari.engineStop();
	}
}