package lambdaTest;

public class MySelfTestJava { 
	public static void main(String[] args) {
		MySelfTest mst = (c1, c2, c3) -> {
			System.out.println("문자열들의 합입니다.");
			return c1+c2+c3;
		};
		System.out.println(mst.word("가", "나", "다"));
	}
}