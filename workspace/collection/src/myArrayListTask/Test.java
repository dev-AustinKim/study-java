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
				
//		Food food1 = new Food("±¹¼ö",100.0,"ÇÑ½Ä");
//		Food food2 = new Food("Â¥Àå¸é",1000.0,"Áß½Ä");		
//		Food food3 = new Food("Â«»Í",700.0,"Áß½Ä");		
//		Food food4 = new Food("ººÀ½¹ä",500.0,"Áß½Ä");		
//		Food food5 = new Food("ÅÁ¼öÀ°",600.0,"Áß½Ä");		
//		
//		foods.add(food1);
//		foods.add(food2);
//		foods.add(food3);
//		foods.add(food4);
//		foods.add(food5);
//		
//		System.out.println(res.check("Â¥Àå¸é"));
//		System.out.println(res.nameByFood("Â«»Í"));
//		System.out.println(res.wantThings("Áß½Ä"));
//		System.out.println(res.checkByKind("Áß½Ä"));
		
		Fruit fruit1 = new Fruit("»ç°ú",1000);
		Fruit fruit2 = new Fruit("¹è",2000);
		Fruit fruit3 = new Fruit("±Ö",3000);
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		
		System.out.println(market.nameFruitPrice("»ç°ú"));
	}
}
