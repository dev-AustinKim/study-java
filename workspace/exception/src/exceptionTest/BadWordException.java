package exceptionTest;
// java.lang.Exception 상속받음 : 컴파일러가 체크
// RuntimeException 상속 : 컴파일러가 체크하지 않음.

public class BadWordException extends RuntimeException {
	public BadWordException(String message) {
		super(message);
	}
}