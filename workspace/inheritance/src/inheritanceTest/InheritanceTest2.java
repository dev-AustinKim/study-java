package inheritanceTest;

class Human {
	void eat() {
		System.out.println("�Ա�");
	}

	void sleep() {
		System.out.println("���ڱ�");
	}

	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
}

class Monkey extends Human { // �޸𸮿��� ������ Ȯ��(extends)�ȴ�.
	void shakeTail() {
		System.out.println("����ġ��");
	}
	
//	@Override // -> �������̵� ���� �� ������ش�. ���� �������̵� �� �޼ҵ����� �𸣱� �����̴�.
 	void walk() {
		System.out.println("�� �� �Ǵ� �� �߷� �ȱ�");
	}
 	
// 	�θ� ���� ���ٸ� super.�޼ҵ�()�� ���ָ� �θ� ���� ���� �� �ؿ� �ڽĿ��� �ʿ��� ������ �߰����� �� �ִ�. super.walk()�� ���ָ� �θ��� Human�� walk�� ���ִ� ���̴�.
// 	void walk() {
// 		super.walk(); // �� �߷� �ȱ� ���.
//		System.out.println("�� �߷� �ȱ�");
//		
//	}
 	
}


public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}