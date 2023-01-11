package myArrayListTask;

import java.util.ArrayList;

public class Restaurant {
	public static ArrayList<Food> foods = DBConnecter.foods;
	public final double percent = 1.1;
	
//	���� �̸����� �˻� ������ �� ��ü�� ������
	public Food check(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}

//	���� ������ �˻��ϸ� �� �迭�� ������
	public ArrayList<Food> checkByKind(String kind) {
		ArrayList<Food> f = new ArrayList<Food>();
		for(Food food : foods) {
			if(food.getKindOfFood().equals(kind)) {
				f.add(food);
			}
		}
		return f;
	}
	
//	���� �߰�
	public void add(Food food) {
		foods.add(food);
	}
	
//	���� �̸����� ���� ���� ��ȸ
	public String nameByFood(String name) {
		return check(name).getKindOfFood();
	}
	
//	����ڰ� ���ϴ� ������ ���� ��ü ��ȸ -> ������ �˻� ���� �ϰ� �� �޼ҵ带 ���� �ȴ�.
	public ArrayList<Food> findAll(String kind) {
		return foods;
	}	
	
//	���� ���� ���� �� ���� 10% ���
	public void modify(String name, String kind) {
		check(name).setKindOfFood(kind);
		check(name).setPrice(check(name).getPrice()*percent);		
	}
	
//	����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public int wantThings(String kind) {
		int total = 0;
		for(Food food : checkByKind(kind)) {
			total++;
		}
		return total;
	}
}