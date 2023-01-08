package adidasTest;

public class Adidas {
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]); // 메뉴가 뭐가 있는지 출력
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 매장입니다.");
			return;
		}
		form.sell("운동화");
	}
}