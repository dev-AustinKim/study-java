package castingTest;


class Car { // Ÿ�Կ� ���� �κ��� �߿��ϴ�.
	void eingineStrart() {
		System.out.println("����� �õ� Ŵ");
	}

}

class SuperCar extends Car{
	@Override
	void eingineStrart() {
		System.out.println("�������� �õ� Ŵ");
	}
	void openRoof() { // �ڽ��� +@ �κ��̴�.
		System.out.println("���� ����");
	}
}



public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari  = new SuperCar();
//		up casting
		Car noOptionFerrari = new SuperCar(); // '=' �� �ں��� �д´�. SuperCar Ÿ���� Car Ÿ�԰� ����? ��� ��� ���̴�. 
		
//		�ڽĿ��� �������� ���� ���. �ƿ� ���Ӱ� ������� �ƴ� ������ �� ���� �ִٸ� ������ �� �޼ҵ尡 ��µȴ�.
//		noOptionFerrari.eingineStrart();
		
//		SuperCar brokenFerrari = (SuperCar)new Car(); // ����(�޸𸮿� �ø��� ��.) ����.(��������� �޸𸮿� �ø��� ���ؼ� ������ ���� ���̴�.) ������ �ȵ�. ������ ������ ���� ����.
		
//		downcasting �ٿ� ĳ������ noOptionFerrari�� fullOptionFerrari
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		
//    matiz instanceof Car : true
      System.out.println(matiz instanceof Car);
      
//    matiz instanceof SuperCar : false
      System.out.println(matiz instanceof SuperCar);
      
//    ferrari instanceof Car : true -> ��� �ڽ�Ÿ���� �θ� Ÿ���̴�.
      System.out.println(ferrari instanceof Car);
      
//    ferrari instanceof SuperCar : true
      System.out.println(ferrari instanceof SuperCar);
      
//		upcasting �� ��ü�� �θ�� �ڽ� Ÿ�� �� �� ���´�.
//    noOptionFerrari instanceof Car : true
      System.out.println(noOptionFerrari instanceof Car);
      
//    noOptionFerrari instanceof SuperCar : true // ������� ���� ��.
      System.out.println(noOptionFerrari instanceof SuperCar);
      
//    fullOptionFerrari instanceof Car : true
      System.out.println(fullOptionFerrari instanceof Car);
      
//    fullOptionFerrari instanceof SuperCar : true
      System.out.println(fullOptionFerrari instanceof SuperCar);
   }
}

