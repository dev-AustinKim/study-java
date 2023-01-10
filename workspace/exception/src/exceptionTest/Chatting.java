package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메세지 : ");
		message = sc.nextLine();
		
//		if(message.contains("바보")) { // contains는 앞에 있는 문자열(message)에서 뒤에 있는 문자열(바보)만 들어있다면 true가 나온다.
//			throw new BadWordException("욕설은 안돼요!"); // 예외를 필드에 올려서 발생을 시킴. 던지기.
//		}
		
		
		// Alt + Shift + z -> 내가 감싼걸 어떤걸로 감쌀까?
//		Alt + Shift + z + y -> try-catch문 생성
		
		// RuntimeException을 상속받을 때
		if(message.contains("바보")) {  
				throw new BadWordException("욕설은 안돼요!");

		}

		
		// Exception을 상속받을 때
//		if(message.contains("바보")) { 
//			try {
//				throw new BadWordException("욕설은 안돼요!");
//			} catch (BadWordException e) {
//				System.out.println(e.getMessage());
//			}
//
//		}
	}
}