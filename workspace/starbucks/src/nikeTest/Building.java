package nikeTest;

import java.util.Iterator;

public class Building {

	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		
		gangnam.register(new FormAdapter() {	
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return new String[] {"범고래", "에어포스 1", "테일윈드"};
			}
		});
		
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return new String[] {"나이키 옷", "나이키 가방", "나이키 바지"};
			}
			
			@Override
			public void sell(String menu) {
				String[] menuj = getMenu();
				for (int i = 0; i < menuj.length; i++) {
					if(menuj[i].equals(menu)) {
						System.out.println(menu +" 판매 완료");
					}
				}
			}
		});
	}

}
