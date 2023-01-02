package stringTest;

import java.util.Scanner;

// 혼자 다시해보기.
public class StringTask {
	public static void main(String[] args) {
		//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
		//		대문자는 모두 소문자로 변경한다.
		// null 일때는 밑에서 대입을 할 때 사용하는 것이고, 
		// ""는 누적연결을 할 때 사용한다.
		// null로 초기화 했다면, 대입 연산자를 사용하겠다는 뜻. ex) data = 안녕;
		// ""로 초기화 했다면, 누적 연산자를 사용하겠다는 뜻.
		String inter = null;
		String result = "";
		System.out.print("문자열을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		inter = sc.nextLine();
		for(int i = 0; i < inter.length(); i++) {
			if(inter.charAt(i)>=97 && inter.charAt(i)<=122) {
				result += (char)(inter.charAt(i)-32); // 소문자일 경우.
			} else if(inter.charAt(i)>=65 && inter.charAt(i)<=90){ // 다른 특수부호가 있을 수도 있으니 else가 아닌 else if로 해야한다.
				result += (char)(inter.charAt(i)+32);
			}
		}
		System.out.println(result);
		//		정수를 한글로 변경
		//		예)1024 -> 일공이사
//		System.out.print("정수를 한글로 변경, 정수를 입력하세요 : ");
//		String num = sc.nextLine();
//		for(int i = 0; i < num.length(); i++) {
//			switch(num.charAt(i)) {
//			case '0' : System.out.print("공");
//			break;
//			case '1' : System.out.print("일");
//			break;
//			case '2' : System.out.print("이");
//			break;
//			case '3' : System.out.print("삼");
//			break;
//			case '4' : System.out.print("사");
//			break;
//			case '5' : System.out.print("오");
//			break;
//			case '6' : System.out.print("육");
//			break;
//			case '7' : System.out.print("칠");
//			break;
//			case '8' : System.out.print("팔");
//			break;
//			case '9' : System.out.print("구");
//			break;	
//			// default 생략.
//			}
//		}
		// 강사님 버전 정수 버전
//		String message = "정수 : " , result = "";
//		String hangle = "공일이삼사오육칠팔구";
//		Scanner sc = new Scanner(System.in);
//		int number = 0;
//		System.out.println(message);
//		number = sc.nextInt();
//		while(number != 0) {
//			result = hangle.charAt(number)%10 +result;
//			number /= 10;
//		}
//		System.out.println(result);
		
		// 강사님 버전 문자열 버전
//		String message = "정수 : " , result = "";
//		String hangle = "공일이삼사오육칠팔구";
//		Scanner sc = new Scanner(System.in);
//		String data = null;
//		System.out.print(message);
//	      data = sc.next();
//	      
//	      for (int i = 0; i < data.length(); i++) {
//	         result += hangle.charAt(data.charAt(i) - 48);
//	      }   
//	      System.out.println(result);
		
	}
}