package inheritanceTest;

class Human {
	void eat() {
		System.out.println("먹기");
	}

	void sleep() {
		System.out.println("잠자기");
	}

	void walk() {
		System.out.println("두 발로 걷기");
	}
}

class Monkey extends Human { // 메모리에서 영역이 확장(extends)된다.
	void shakeTail() {
		System.out.println("꼬리치기");
	}
	
//	@Override // -> 오버라이딩 해줄 때 사용해준다. 누가 오버라이딩 된 메소드인지 모르기 때문이다.
 	void walk() {
		System.out.println("두 발 또는 네 발로 걷기");
	}
 	
// 	부모 것을 쓴다면 super.메소드()를 해주면 부모 것을 쓰고 그 밑에 자식에서 필요한 내용을 추가해줄 수 있다. super.walk()를 해주면 부모인 Human의 walk를 해주는 것이다.
// 	void walk() {
// 		super.walk(); // 두 발로 걷기 출력.
//		System.out.println("네 발로 걷기");
//		
//	}
 	
}


public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}