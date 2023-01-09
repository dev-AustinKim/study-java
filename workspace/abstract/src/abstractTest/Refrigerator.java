package abstractTest;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		System.out.println("냉장고 전원 켜기");
	}

	@Override
	public void off() {
		System.out.println("냉장고 전원 끄기");
	}
}