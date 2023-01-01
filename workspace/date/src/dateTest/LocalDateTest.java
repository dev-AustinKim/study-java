package dateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� hh�� mm�� ss��"); //AM PM �ȳ��� (12�ð� ����)
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� a hh�� mm�� ss��"); //AM PM ����(12�ð� ����)
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"); //17�� �̷��� ����(24�ð� ����)
		
//		parse�� ���� ���ϴ� Ÿ������ �ٲ��ٶ� ���.
		System.out.println(LocalDateTime.parse("2023�� 12�� 04�� 12�� 00�� 00��",DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��")));
		
		System.out.println(now);
		System.out.println(localDateTime);
		System.out.println(localDateTime.format(dateTimeFormatter));
		System.out.println(localDateTime.format(dateTimeFormatter2));
		System.out.println(localDateTime.format(dateTimeFormatter3));
			
		
	}
}