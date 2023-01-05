package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	public Car() {;} // �Ϻη� ������� �Ŵϱ� �ڵ� �ۼ����� ����� ǥ��.
	
	public Car(String brand, String color, int price) { // Alt + Shift + S ������ ���� O ������ �ȴ�.	
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends Car{ // �ڽ��� �⺻ �����ڴ� ������ �θ��� �⺻ �����ڸ� �θ���. ���� �θ� �⺻ �����ڰ� ���ٸ� �ڽĿ��� �⺻ ������ ���� �θ�� �Ȱ��� �����ڸ� �ϳ� ���������Ѵ�.
	String mode;
	
	public SuperCar(String brand, String color, int price, String mode) {
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//		���� 3���� �θ� �������� ȣ��� �ѹ��� �ʱ�ȭ�� �� �ִ�.
		super(brand,color,price); // Alt + Shift + S -> O -> super�� ��ӹ޾Ƽ� �ʱ�ȭ ���ָ� �ȴ�.
		this.mode = mode;
	}
	
//	����ī�� �������� �õ��� �Ѱ� �� �� �ִ�.
	@Override // ���澲�� Ctrl + SpaceBar �ϸ� �������̵� �ڵ����� �������.
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 55000, "Sport");
		ferrari.engineStart();
		ferrari.engineStop();
	}
}