package lambdaTest;

public class MySelfTestJava { 
	public static void main(String[] args) {
		MySelfTest mst = (c1, c2, c3) -> {
			System.out.println("���ڿ����� ���Դϴ�.");
			return c1+c2+c3;
		};
		System.out.println(mst.word("��", "��", "��"));
	}
}