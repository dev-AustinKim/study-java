package starBucksTest;

// ��Ÿ���� ����
public class Starbucks {
//	�������� ó���� �� �� ����� ��
//	���翡�� ���س��� ����� �ۼ��Ͽ� form���� �����Ѵ�.
	public void register(Form form) { // �������� ������ form�� �ٸ���.
//		�������� �޴��� ���� ������ �˻�
		String[] menu = form.getMenu(); // building���� �ۼ��� ���� ����(Starbucks Ŭ����)���� �ٷ� �޾Ƽ� ����� ���̴�.
		for (int i = 0; i < menu.length; i++) { 
			System.out.println(menu[i]);
		}
		
//		���� ���ᳪ�������� ��쿡��
		if(form instanceof FormAdapter) { 
			System.out.println("���ᳪ�� �����Դϴ�.");
			return;
		}
//		���� �Ǹ� ������ ��� �Ǹ� ��� �˻�.
		form.sell("�Ƹ޸�ī��"); 
	}
}