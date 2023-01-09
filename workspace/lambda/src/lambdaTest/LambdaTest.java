package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		lambdaInter에는 람다식의 주소값이 들어있는 것이다.
		LambdaInter lambdaInter = (number) -> number%10 == 0; // LambdaInter에서 구현한 메소드에 10을 넣어주고
//		여기서 재정의 해준다.(number%10 == 0;이 바디이다.) 한줄로 가능.
//		또한 number는 인터페이스에서 선언했을 때 int형으로 선언했기 때문에 그냥 number만 써놔도 사용할 땐 저 자리에 인트형으로 넣어줘야 된다. 그렇지 않으면 오류
		
//		(number) 이것이 익명 메소드이다. 이름이 없기 때문이다. 또한 이것이 람다식이다.
		boolean result = lambdaInter.checkMultipleOf10(10);
		System.out.println(result);
		
//		LambdaInter lambdaInter = number -> {
//			System.out.println("10의 배수 검사");
//			return number%10 == 0;
//		};
	
//		boolean result2 = lambdaInter.checkMultipleOf10(100);
//		System.out.println(result2);
	}
}