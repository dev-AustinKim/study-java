package exceptionTest;
// java.lang.Exception ��ӹ��� : �����Ϸ��� üũ
// RuntimeException ��� : �����Ϸ��� üũ���� ����.

public class BadWordException extends RuntimeException {
	public BadWordException(String message) {
		super(message);
	}
}