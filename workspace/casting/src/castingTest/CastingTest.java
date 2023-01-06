package castingTest;


class Car { // 타입에 대한 부분이 중요하다.
	void eingineStrart() {
		System.out.println("열쇠로 시동 킴");
	}

}

class SuperCar extends Car{
	@Override
	void eingineStrart() {
		System.out.println("음성으로 시동 킴");
	}
	void openRoof() { // 자식의 +@ 부분이다.
		System.out.println("지붕 열기");
	}
}



public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari  = new SuperCar();
//		up casting
		Car noOptionFerrari = new SuperCar(); // '=' 는 뒤부터 읽는다. SuperCar 타입이 Car 타입과 같니? 라고 물어본 것이다. 
		
//		자식에서 재정의한 것이 출력. 아예 새롭게 만든것이 아닌 재정의 한 것이 있다면 재정의 한 메소드가 출력된다.
//		noOptionFerrari.eingineStrart();
		
//		SuperCar brokenFerrari = (SuperCar)new Car(); // 빌드(메모리에 올리는 것.) 오류.(빌드오류는 메모리에 올리지 못해서 오류가 나는 것이다.) 실행이 안됨. 컴파일 오류는 문제 없음.
		
//		downcasting 다운 캐스팅한 noOptionFerrari를 fullOptionFerrari
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		
//    matiz instanceof Car : true
      System.out.println(matiz instanceof Car);
      
//    matiz instanceof SuperCar : false
      System.out.println(matiz instanceof SuperCar);
      
//    ferrari instanceof Car : true -> 모든 자식타입은 부모 타입이다.
      System.out.println(ferrari instanceof Car);
      
//    ferrari instanceof SuperCar : true
      System.out.println(ferrari instanceof SuperCar);
      
//		upcasting 된 객체는 부모와 자식 타입 둘 다 갖는다.
//    noOptionFerrari instanceof Car : true
      System.out.println(noOptionFerrari instanceof Car);
      
//    noOptionFerrari instanceof SuperCar : true // 여기까진 이해 됌.
      System.out.println(noOptionFerrari instanceof SuperCar);
      
//    fullOptionFerrari instanceof Car : true
      System.out.println(fullOptionFerrari instanceof Car);
      
//    fullOptionFerrari instanceof SuperCar : true
      System.out.println(fullOptionFerrari instanceof SuperCar);
   }
}

