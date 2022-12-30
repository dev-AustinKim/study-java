package controlStatement;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//		사용자에게 아래의 메뉴를 출력하고
//		번호를 입력받는다.
//		1. 빨간색
//		2. 검은색
//		3. 노란색
//		4. 흰색
//		사용자가 입력한 번호의 색상을 영어로 출력한다.
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, choice = 0;		
		System.out.print("아래의 메뉴 중 한 가지의 번호를 선택해주세요.\n");
		System.out.print("1. 빨간색\n2. 검은색\n3. 노란색\n4. 흰색 \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Red");
		}else if(choice == 2) {
			System.out.println("Black");
		}else if(choice == 3) {
			System.out.println("Yellow");
		}else if(choice==4){
			System.out.println("White");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		/* 강사님 버전 일괄처리. 자바는 일괄처리 하는게 좋다. 일괄처리 = 출력을 한번만.
		 * package controllStatement;

import java.util.Scanner;

public class IfTask {
   public static void main(String[] args) {
//      사용자에게 아래의 메뉴를 출력하고
//      번호를 입력받는다.
      
//      1. 빨간색
//      2. 검은색
//      3. 노란색
//      4. 흰색

//      사용자가 입력한 번호의 색상을 영어로 출력한다.
      
      String title = "색상을 골라주세요!";
      String menu = "1.빨간색\n2.검은색\n3.노란색\n4.흰색";
      String result = null;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(title);
      System.out.println(menu);
      choice = sc.nextInt();
      
      if(choice == 1) {
         result = "Red";
         
      }else if(choice == 2) {
         result = "Black";
         
      }else if(choice == 3) {
         result = "Yellow";
         
      }else if(choice == 4) {
         result = "White";
         
      }else {
         result = "잘못 입력하셨습니다.";
      }
      
      System.out.println(result);
   }
}

		 */
	}
}

