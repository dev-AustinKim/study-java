package myJob;

import java.util.Random;
import java.util.Scanner;

class RobberId { // 생성자 한번에 만들기 : Alt + Shift + S 후에 Alt + Shift + O
	String name;
	static int totalMoney; // 전체 돈.
	static {
		totalMoney = 0;
	}

	public RobberId(String name){ //
		this.name = name;
	}

	// 상대에 따라 뺏는 확률이 달라짐.
	boolean percent(int data) {
		Random random = new Random();
		int[] rating = new int[10];
		boolean check = false;

		for (int i = 0; i < data / 10; i++) {
			rating[i] = 1;
		}
		if(rating[random.nextInt(10)] == 1) {
			check = true; // true로 바꿔줌.
		}
		return check; // false로 리턴.
	}
}

// 연속 7회 이상 실패 시 강도로써의 자격X

public class Robber {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String name = "";
		int choice = 0, failcount = 0, level = 0;
		boolean flag = false;
		
			
		System.out.print("사용자의 이름을 입력하세요. \n이름 : ");
		name = sc.nextLine();

		RobberId robber = new RobberId(name);

		String message = "훔칠 돈의 양을 선택하세요.\n1.100만원(성공률: 70%)\n2.1000만원(성공률: 40%)\n3.6000만원(성공률: 30%)\n4.1억(성공률: 10%)";

		while(true) {
			System.out.println(message);
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("100만원을 선택하셨습니다.");
			if(robber.percent(70)==false) { 
				System.out.println("훔치기 실패ㅠㅠ, 도망가~");
				failcount++;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
			} else {
				System.out.println("훔치기 성공, 맛있다..!");
				robber.totalMoney += 100;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
			}

			break;

			case 2 : System.out.println("1000만원을 선택하셨습니다.");
			if(robber.percent(40)==false) { 
				System.out.println("훔치기 실패ㅠㅠ, 도망가~");
				failcount++;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
			} else {
				System.out.println("훔치기 성공, 맛있다..!");
				robber.totalMoney += 1000;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
				if(robber.totalMoney==10000) {
				}
			}
			break;

			case 3 : System.out.println("6000만원을 선택하셨습니다.");
			if(robber.percent(30)==false) { 
				System.out.println("훔치기 실패ㅠㅠ, 도망가~");
				failcount++;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
			} else {
				System.out.println("훔치기 성공, 맛있다..!");
				robber.totalMoney += 6000;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
			}
			break;

			case 4 : System.out.println("1억원을 선택하셨습니다.");
			if(robber.percent(10)==false) { 
				System.out.println("훔치기 실패ㅠㅠ, 도망가~");
				failcount++;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney+ "\n총 실패 횟수 : " + failcount);
			} else {
				System.out.println("훔치기 성공, 맛있다..!");
				robber.totalMoney += 10000;
				System.out.println(robber.name + "님의 총 훔친 돈 : " + robber.totalMoney + "\n총 실패 횟수 : " + failcount);
			}

			break;

			default :
				System.out.println("없는 번호입니다. 다시 선택하세요.");
			}
			if(failcount>6) { // 7회이상 실패시 종료.
//				flag = false;
				if(!flag) { 
					System.out.println("이런 실력으로 강도할꺼면 그냥 정직하게 살아라~");
					break;
				}
			}
		}
	}
}