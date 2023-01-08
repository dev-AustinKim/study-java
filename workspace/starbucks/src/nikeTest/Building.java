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
				return new String[] {"����", "�������� 1", "��������"};
			}
		});
		
		jamsil.register(new Form() {
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return new String[] {"����Ű ��", "����Ű ����", "����Ű ����"};
			}
			
			@Override
			public void sell(String menu) {
				String[] menuj = getMenu();
				for (int i = 0; i < menuj.length; i++) {
					if(menuj[i].equals(menu)) {
						System.out.println(menu +" �Ǹ� �Ϸ�");
					}
				}
			}
		});
	}

}
