package myArrayListTask;

import java.util.ArrayList;

public class Restaurant {
	public static ArrayList<Food> foods = DBConnecter.foods;
	public final double percent = 1.1;
	
//	음식 이름으로 검사 있으면 그 객체를 돌려줌
	public Food check(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}

//	음식 종류로 검사하면 그 배열를 돌려줌
	public ArrayList<Food> checkByKind(String kind) {
		ArrayList<Food> f = new ArrayList<Food>();
		for(Food food : foods) {
			if(food.getKindOfFood().equals(kind)) {
				f.add(food);
			}
		}
		return f;
	}
	
//	음식 추가
	public void add(Food food) {
		foods.add(food);
	}
	
//	음식 이름으로 음식 종류 조회
	public String nameByFood(String name) {
		return check(name).getKindOfFood();
	}
	
//	사용자가 원하는 종류의 음식 전체 조회 -> 종류로 검색 먼저 하고 이 메소드를 쓰면 된다.
	public ArrayList<Food> findAll(String kind) {
		return foods;
	}	
	
//	음식 종류 수정 후 가격 10% 상승
	public void modify(String name, String kind) {
		check(name).setKindOfFood(kind);
		check(name).setPrice(check(name).getPrice()*percent);		
	}
	
//	사용자가 원하는 종류의 음식 개수 조회
	public int wantThings(String kind) {
		int total = 0;
		for(Food food : checkByKind(kind)) {
			total++;
		}
		return total;
	}
}