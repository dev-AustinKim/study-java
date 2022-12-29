package variableTest;

public class StorageClassTest2 {
	public static void main(String[] args) {
		StorageClassTest1 object = new StorageClassTest1();
		
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s(); // static 변수는 클래스로 접근을 해야한다. static 변수 = 클래스 변수.
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		object = new StorageClassTest1(); // static 필드는 new에 영향을 받지 않는다. static은 컴파일러가 올린다.(계속 메모리에 올라가 있는다.)
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		
		
		
		
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object = new StorageClassTest1(); // 초기화가 되고 다시 새로 시작한다. 이전에 있던 것은 날라감.
////		즉, 전역변수는 new를 만나면 기존에 있던 주소 값에 새로운 주소 값이 들어 가니까 기존에 있던 주소 값이 없어지고 새로 시작한다.
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();		
//		
		
	}
}
