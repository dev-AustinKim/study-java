package myArrayListTask;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Food> foods = Restaurant.foods;
		ArrayList<Fruit> fruits = Market.fruits;
		ArrayList<Love> loves = DateApp.lovers;
		
		Food food = new Food();
		Restaurant res = new Restaurant();
		Market market = new Market();
		Fruit fruit = new Fruit();
				
//		Food food1 = new Food("����",100.0,"�ѽ�");
//		Food food2 = new Food("¥���",1000.0,"�߽�");		
//		Food food3 = new Food("«��",700.0,"�߽�");		
//		Food food4 = new Food("������",500.0,"�߽�");		
//		Food food5 = new Food("������",600.0,"�߽�");		
//		
//		foods.add(food1);
//		foods.add(food2);
//		foods.add(food3);
//		foods.add(food4);
//		foods.add(food5);
//		
//		System.out.println(res.check("¥���"));
//		System.out.println(res.nameByFood("«��"));
//		System.out.println(res.wantThings("�߽�"));
//		System.out.println(res.checkByKind("�߽�"));
		
		Fruit fruit1 = new Fruit("���",1000);
		Fruit fruit2 = new Fruit("��",2000);
		Fruit fruit3 = new Fruit("��",3000);
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		
		System.out.println(market.nameFruitPrice("���"));
	}
}
