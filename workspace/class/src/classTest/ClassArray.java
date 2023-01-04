package classTest;

import java.util.Scanner;

public class ClassArray {
	public static void main(String[] args) {
		Shop shop = new Shop("과자", 3000, 10);
		//		Customer[] customers = new Customer[2];	// 자료형 자리에 클래스 타입도 들어간다. 클래스 배열은 첫번째 접근할 때는 주소값이므로
		//		// 값을 찾으려면 두 번을 접근해야 한다. 선언만 하면 null이 들어간다.

		//		for (int i = 0; i < customers.length; i++) {
		//			customers[i] = new Customer(); // 주소값을 넣은 것이다.
		//			

		//		}
		Customer[] customers = {
				new Customer("Tom", "01012341234", 50000, 10),
				new Customer("Jack", "01055556666", 100000, 50)
		};
		Scanner sc = new Scanner(System.in);
		int choice = 0, result = 0;


		System.out.println("어떤 손님으로 진행하시겠어요?");
		System.out.println("1. Tom");
		System.out.println("2. Jack");
		choice = sc.nextInt();
		result = shop.sell(customers[choice - 1]);
		System.out.println("구매 내역");
		System.out.println("상품명: " + shop.name);
		System.out.println("상품가격: " + shop.price);
		System.out.println("할인율: " + customers[choice - 1].discount);
		System.out.println("최종 결제 금액: " + result);
	}
}
