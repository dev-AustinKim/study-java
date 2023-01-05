package inheritanceTest;

class A {
   String name = "A";
   int data = 10;
   
   public A() {
      System.out.println("부모 생성자 호출");
   }
   
   void printName() {
      System.out.println(name);
   }
}

class B extends A{
   
   public B() {
      super();
      System.out.println("자식 생성자 호출");
   }
   
   void printData() {
      System.out.println(data);
   }
}


public class InheritanceTest1 {	// super() -> 클래스 이름 뒤에 소괄호가 있으면 생성자이다.
//	this가 나라면 super는 부모이다. super가 가장 먼저 올라가야 한다. 이유 : 부모가 먼저 호출되고 자식이 호출되어야 하기 때문이다.
//	this가 나의 주소를 담고있고, super가 부모의 주소를 담고 있다.
	
//	중요한 것 : 자식 객체는 super를 통해서 부모한테 접근할 수 있다. 따라서 자식 객체를 호출하려면 부모를 먼저 호출되어야 한다.
	public static void main(String[] args) {
	      B b = new B();
	      System.out.println(b);
	      b.name = "B";
	      b.printName();
	}
}