package myArrayListTask;

public class DateTest {
	public static void main(String[] args) {
		Love love1 = new Love();
		Love love2 = new Love();
		love1.setAge(13);
		love1.setName("±èµ¿ÇÑ");
		love1.setNumber("01011112222");
		love2.setAge(15);
		
		love2.setName("È«±æµ¿");
		love2.setNumber("01033334444");
		DateApp dateapp = new DateApp();
		dateapp.add(love1);
		dateapp.add(love2);
		System.out.println(love1);
	}
}