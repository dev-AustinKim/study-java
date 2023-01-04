package classTest;

class Car {
	

	
//	브랜드
//	색상
//	가격

	String brand;
	String color;
	int price;
	
	Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;	
	}
	
	Car(String color, int price) { // 오버로딩
		this.color = color;
		this.price = price;	
	}
	
//	시동켜기(브랜드 시동 켜기)
	void turnOn() {
		System.out.println(this.brand + "시동켜기.");
	}
//	시동끄기(브랜드 시동 끄기)
	void turnOff() {
		System.out.println(this.brand + "시동끄기.");
	}
}


public class Road {
	public static void main(String[] args) {
		Car car = new Car("페라리", "빨강", 3000);
//		car.brand = "페라리";
//		car.color = "빨강";
//		car.price = 3000;
		car.turnOn();
		car.turnOff();
	}
}
