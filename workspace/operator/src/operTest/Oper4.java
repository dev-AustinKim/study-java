package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		심리 테스트
		/*
		 * Q. 당신이 좋아하는 색을 선택하세요.
		 * 1. 빨간색
		 * 2. 노란색
		 * 3. 검은색
		 * 4. 흰색
		 * 
		 * 빨간색 : 불같고 열정적이고 적극적이다.
		 * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
		 * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
		 * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		 * 
		 */
		int num = 0; // 내가 입력한 값의 초기값 설정.
		String menu = "Q. 당신이 좋아하는 색을 선택하세요.\n1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색"
				,red = "1. 빨간색 : 불같고 열정적이고 적극적이다." , yellow = "2. 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다." 
				,black = "3. 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.", white = "4. 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.", result = null; // menu = Q(질문) , result = 최종 결과 값.
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); // num = 1~4 사이에 내가 입력한 값. 
		
		// 최종 결과값 result에 1이면 빨간색에 관련한 내용을, 아니라면 2라면 노란색에 관련한 내용을, 아니라면 3이라면 검은색에 관련된 내용을, 아니라면 4라면 흰색에 관련된 내용을, 아니라면 보기에 없다.를 저장한다.
		result = num == 1 ? result = red : num == 2 ? result = yellow 
				: num == 3 ? result = black : num == 4 ? result = white : "보기에 없습니다.";
		System.out.println(result); // 최종 결과값 출력
		sc.close();	// scanner를 닫아준다.
		
		// 강사님 버전
//      심리 테스트
//      /*
//       * Q. 당신이 좋아하는 색을 선택하세요.
//       * 1. 빨간색
//       * 2. 노란색
//       * 3. 검은색
//       * 4. 흰색
//       * 
//       * 빨간색 : 불같고 열정적이고 적극적이다.
//       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
//       * 
//       */
//      String message = "Q. 당신이 좋아하는 색을 선택하세요.";
//      String choiceMessage = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//      String redMessage = "불같고 열정적이고 적극적이다."; 
//      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
//      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
//      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
//      String errorMessage = "다시 입력해주세요.";
//      String result = null;
//      Scanner sc = new Scanner(System.in);
//      int choice = 0;
//      
//      System.out.println(message + "\n" + choiceMessage);
//      choice = sc.nextInt();
//      
////      result = choice == 1 ? redMessage :
////         choice == 2 ? yellowMessage :
////            choice == 3 ? blackMessage :
////               choice == 4 ? whiteMessage :
////                  errorMessage;
////      if(choice == 1) {
////         result = redMessage;
////         
////      }else if(choice == 2) {
////         result = yellowMessage;
////         
////      }else if(choice == 3) {
////         result = blackMessage;
////         
////      }else if(choice == 4) {
////         result = whiteMessage;
////         
////      }else {
////         result = errorMessage;
////         
////      }
//      
//      switch(choice) {
//      case 1:
//         result = redMessage;
//         break;
//      case 2:
//         result = yellowMessage;
//         break;
//      case 3:
//         result = blackMessage;
//         break;
//      case 4:
//         result = whiteMessage;
//         break;
//      default:
//         result = errorMessage;
//         break;
//      }
//      
//      System.out.println(result);

		
		
	}
}