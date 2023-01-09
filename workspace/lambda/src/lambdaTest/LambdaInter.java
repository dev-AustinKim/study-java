package lambdaTest;

@FunctionalInterface // 하나의 메소드만 선언해라. 함수형 인터페이스다. 라고 알려준 것이다.
public interface LambdaInter {
	public boolean checkMultipleOf10(int number); // 인터페이스니까 추상 메소드로 틀만 준거다.
}