package ambiguity;

public interface InterA {
//	public void printData() { �׻� abstract�� �ٱ� ������ ������ ����.
//		System.out.println("InterA");
//	}
	public default void printData() { // default�� "�� �Ϲݸ޼ҵ�� ���ž�!" ��� �ǹ��̴�.
		System.out.println("InterA");
	}
}
