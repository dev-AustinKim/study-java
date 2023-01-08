package adidasTest;

public class building {
	public static void main(String[] args) {
		Adidas jamsil = new Adidas(); // 잠실이 판매방식 없음
		Adidas gangnam = new Adidas();
		
		
		gangnam.register(new Form() {
			@Override
			public void sell(String menu) {
				String[] menus  = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menu.equals(menus[i])) {						
						System.out.println(menu + "가 팔렸습니다.");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"운동화", "티셔츠", "바지"};
			}
//			public String[] getPrice() { } -> 자식 클래스의 +@부분
		});
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] {"패딩", "축구공"};
			}
		});
		
	}
}