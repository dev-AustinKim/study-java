package myArrayListTask;

public class Food {
	private String name;
	private double price;
	private String kindOfFood;
	
	public Food() {;}
	
	public Food(String name, double price, String kind) {
		this.name = name;
		this.price = price;
		this.kindOfFood = kind;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getKindOfFood() {
		return kindOfFood;
	}
	public void setKindOfFood(String kindOfFood) {
		this.kindOfFood = kindOfFood;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", kindOfFood=" + kindOfFood + "]";
	}
	
	
}
