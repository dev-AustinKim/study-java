package myArrayListTask;

import java.util.ArrayList;

public class Market {
	public static ArrayList<Fruit> fruits = DBConnecter.fruits;
	
//	�����߰�
	public void addFruits(Fruit fruit) {	
		fruits.add(fruit);
	}
	
//	���� ����
	public void deleteFruits(Fruit fruit) {
		fruits.remove(findAll(fruit).getName());
	}
//
//	���� ������ ��պ��� ������ �˻� 
	public boolean checkPrice(Fruit fruit) {
		double avg = 0.0;
		for(Fruit f : fruits) {
			avg += fruit.getPrice();
		}
		if(findAll(fruit).getPrice()>avg) {
			return false; // ������ ��պ��� ����
		}
		return true; // ������ ��պ��� ����
	}
	
//	ȭ�鿡�� ���� ��ü��ȸ�� �����ϰ� �� ��ü�� �ϳ� ã�� ������ �����ϰ� ���� ��ȸ�ϰ� �׷��� �ȵǴ��� �ϳ��� �޼ҵ�� �ϳ��� ��ɸ� �ϰ�����! �׷��� ���� ������ �����ϴ°� ����.
	
//	���� ��ü ��ȸ
	public Fruit findAll(Fruit fruit) { 
		for(int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(fruit.getName())) {
				return fruit;
			}
		}
		return null;
	}
//	���� �̸����� ���� ��ȸ
	public double nameFruitPrice(String name) {
		for(int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(name)) {
				return fruits.get(i).getPrice();
			}
		}
		return 0.0; // �ش� ������ �̸��� ����. �� ���� ������ ������ ã���� �� ��.
	}
	
}
