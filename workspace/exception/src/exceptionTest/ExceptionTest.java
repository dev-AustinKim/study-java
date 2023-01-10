package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {			
			System.out.println(10/0);
			System.out.println("연산 성공");
		} catch(ArithmeticException e) {
//			e.printStackTrace(); // 오류가 난 곳까지 추적해준다. catch문에서 출력한 것임. 강제종료 된 것이 아님. 정확하게 몇번째 줄에서 오류가 났는지 확인. -> 검증
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(e.getMessage()); // 오류 메세지 출력.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
