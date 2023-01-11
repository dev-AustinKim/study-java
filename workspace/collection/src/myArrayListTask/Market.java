package myArrayListTask;

import java.util.ArrayList;

public class Market {
	public static ArrayList<Fruit> fruits = DBConnecter.fruits;
	
//	과일추가
	public void addFruits(Fruit fruit) {	
		fruits.add(fruit);
	}
	
//	과일 삭제
	public void deleteFruits(Fruit fruit) {
		fruits.remove(findAll(fruit).getName());
	}
//
//	과일 가격이 평균보다 낮은지 검사 
	public boolean checkPrice(Fruit fruit) {
		double avg = 0.0;
		for(Fruit f : fruits) {
			avg += fruit.getPrice();
		}
		if(findAll(fruit).getPrice()>avg) {
			return false; // 가격이 평균보다 높음
		}
		return true; // 가격이 평균보다 낮음
	}
	
//	화면에서 과일 전체조회를 먼저하고 그 객체를 하나 찾은 다음에 삭제하고 가격 조회하고 그러면 안되는지 하나의 메소드는 하나의 기능만 하게하자! 그래서 따로 나눠서 구현하는게 낫다.
	
//	과일 전체 조회
	public Fruit findAll(Fruit fruit) { 
		for(int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(fruit.getName())) {
				return fruit;
			}
		}
		return null;
	}
//	과일 이름으로 가격 조회
	public double nameFruitPrice(String name) {
		for(int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getName().equals(name)) {
				return fruits.get(i).getPrice();
			}
		}
		return 0.0; // 해당 과일의 이름이 없음. 즉 없는 과일의 가격을 찾으려 할 때.
	}
	
}
