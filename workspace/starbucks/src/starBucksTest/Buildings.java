package starBucksTest;

public class Buildings extends Starbucks {

	public static void main(String[] args) {
		Starbucks jamsil = new Starbucks();
		Starbucks gangnam = new Starbucks();

//		�޴��� �����ϸ� �Ǳ� ������ FormAdapter�� �ۼ�
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��", "īǪġ��"};
			}
		});
		
//		��� ��ü�� �ۼ��ؾ� �ϱ� ������ Form�� �ۼ��Ѵ�.
		gangnam.register(new Form() { // �� ��°�ΰ� �ּҰ� �ѹ� ����� �� �� ���� �Ѱ��ش�.
			
			
			int a = 0;
			
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��", "īǪġ��", "��������"};
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menu + " �Ǹ� �Ϸ�");
					}
				}
			}
		});		
	}
}