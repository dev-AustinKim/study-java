package adidasTest;

public class building {
	public static void main(String[] args) {
		Adidas jamsil = new Adidas(); // ����� �ǸŹ�� ����
		Adidas gangnam = new Adidas();
		
		
		gangnam.register(new Form() {
			@Override
			public void sell(String menu) {
				String[] menus  = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menu.equals(menus[i])) {						
						System.out.println(menu + "�� �ȷȽ��ϴ�.");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"�ȭ", "Ƽ����", "����"};
			}
//			public String[] getPrice() { } -> �ڽ� Ŭ������ +@�κ�
		});
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] {"�е�", "�౸��"};
			}
		});
		
	}
}