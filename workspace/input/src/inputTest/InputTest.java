package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + o
		
//		초기값 : 아직 어떤 값을 넣을지 모를 때 넣는 값
//		정수 : 0
//		실수 : 0.0
//		문자 : ' '
//		문자열 : null
		
		String name = "";
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println(name + "님 환영합니다.");
		
	}
}