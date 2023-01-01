package dateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"); //AM PM 안나옴 (12시간 기준)
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초"); //AM PM 나옴(12시간 기준)
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"); //17시 이렇게 나옴(24시간 기준)
		
//		parse는 내가 원하는 타입으로 바꿔줄때 사용.
		System.out.println(LocalDateTime.parse("2023년 12월 04일 12시 00분 00초",DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")));
		
		System.out.println(now);
		System.out.println(localDateTime);
		System.out.println(localDateTime.format(dateTimeFormatter));
		System.out.println(localDateTime.format(dateTimeFormatter2));
		System.out.println(localDateTime.format(dateTimeFormatter3));
			
		
	}
}