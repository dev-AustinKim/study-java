package ambiguity;

public interface InterA {
//	public void printData() { 항상 abstract가 붙기 때문에 오류가 난다.
//		System.out.println("InterA");
//	}
	public default void printData() { // default는 "난 일반메소드로 쓸거야!" 라는 의미이다.
		System.out.println("InterA");
	}
}
