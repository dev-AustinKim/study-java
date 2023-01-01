package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
//		Date는 Date.util만 쓰자 Date.sql은 쓰지마.
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		System.out.println(now);
		System.out.println(simpleDateFormat.format(now));
		
//		getTime() : 두 날짜의 차이를 구할 때 사용, 밀리초 리턴
		System.out.println(now.getTime());
		
		
		Date date1 = new Date();
		System.out.println("한동석");
		Date date2 = new Date();
		
		long l = date2.getTime() - date1.getTime(); // "한동석"을 출력하는데 걸리는 시간을 구할 수 있다.
		System.out.println(l);
		
		
	}
}