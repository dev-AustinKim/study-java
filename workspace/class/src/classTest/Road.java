package classTest;

class Car {
	

	
//	�귣��
//	����
//	����

	String brand;
	String color;
	int price;
	
	Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;	
	}
	
	Car(String color, int price) { // �����ε�
		this.color = color;
		this.price = price;	
	}
	
//	�õ��ѱ�(�귣�� �õ� �ѱ�)
	void turnOn() {
		System.out.println(this.brand + "�õ��ѱ�.");
	}
//	�õ�����(�귣�� �õ� ����)
	void turnOff() {
		System.out.println(this.brand + "�õ�����.");
	}
}


public class Road {
	public static void main(String[] args) {
		Car car = new Car("���", "����", 3000);
//		car.brand = "���";
//		car.color = "����";
//		car.price = 3000;
		car.turnOn();
		car.turnOff();
	}
}
