package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
//		Date�� Date.util�� ���� Date.sql�� ������.
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		System.out.println(now);
		System.out.println(simpleDateFormat.format(now));
		
//		getTime() : �� ��¥�� ���̸� ���� �� ���, �и��� ����
		System.out.println(now.getTime());
		
		
		Date date1 = new Date();
		System.out.println("�ѵ���");
		Date date2 = new Date();
		
		long l = date2.getTime() - date1.getTime(); // "�ѵ���"�� ����ϴµ� �ɸ��� �ð��� ���� �� �ִ�.
		System.out.println(l);
		
		
	}
}