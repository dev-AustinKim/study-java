package myArrayListTask;

import java.util.ArrayList;

public class DateApp {
	public static ArrayList<Love> lovers = DBConnecter.lovers;
	
//	����� �߰�
	public void add(Love love) {
		lovers.add(love);
	}
	
//	����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
	public Love wantAge(int age) {
		for (Love love : lovers) {
			if(love.getAge()==age) {
				return love;
			}
		}
		return null; //���ϴ� �̻����� ���� ��
	}
	
//	�̻����� ���� ����
	public void changeAge(Love love) {
		love.setAge(love.getAge());
	}
	
//	�̻��� ���̼� ����
	
	
//	 ��ü�� �ٲ��� �� ����? i���� �ε����� �ִ� ��ü�� ������� i+1��° �ִ� ��ü�� �������� �ѹ��� �ٲٰ�
//	public void sortByAge() {
//		for (int i = 0; i < lovers.size(); i++) {
//			Love temp = new Love();
//			if(lovers.get(i).getAge() > lovers.get(i+1).getAge()) {
//				temp = lovers.get(i);
//				lovers.get(i+1) = lovers.get(i);
//				lovers.get(i).setAge(temp);
//			}
//		}
//	}
}