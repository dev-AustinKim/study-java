package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar calendar = Calendar.getInstance(); // �̱��� : ��ü�� �ϳ��� �̃H��
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		try {
			System.out.println(simpleDateFormat.parse("2023/01/15"));			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}