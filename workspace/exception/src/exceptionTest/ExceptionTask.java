package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		
		
//		내 버전. 대충맞다.
//		Scanner sc = new Scanner(System.in);
//		int i = 0; // 배열을 세준다.
//		String num = null;
//		int [] arData = new int[5];
//		

//		try {
//			while(true) {
//				System.out.println("정수를 입력하세요.");
//				num = sc.next();
//				if(num.equals("q")) {System.out.println("q 입력. 나가기."); break;}
//				arData[i] = Integer.parseInt(num);
//				i++;
//			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열을 초과하였습니다. 지금까지의 배열에 담긴 숫자는");
//			for (int j = 0; j < arData.length; j++) {
//				System.out.print(arData[j] + " ");
//			}
//		} catch(NumberFormatException e) {
//			System.out.println("정수 형식으로 입력해주세요.");
//		}
		
//		강사님 버전
	      Scanner sc = new Scanner(System.in);
	      int[] arData = new int[5];
	      String temp = null;
	      
	      for(int i=0;; i++) {
	         System.out.print(i + 1 + "번째 정수[q: 나가기]: ");
	         temp = sc.next();
	         temp = temp.toLowerCase(); // 입력받은 문자를 temp에 항상 소문자로 들어가게 하는 것.
	         if(temp.equals("q")) {
	            break;
	         }
	         
	         try {
	            arData[i] = Integer.parseInt(temp);
	            
	         } catch (NumberFormatException e) {
	            System.out.println("정수만 입력해주세요.");
	            i--;
	            
	         } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("5개의 정수만 입력이 가능합니다.");
	            for (int j = 0; j < arData.length; j++) {
	               System.out.print(arData[j] + " ");
	            }
	            break;
	            
	         } catch (Exception e) {
	            System.out.println("다시 시도해주세요.");
	            i--;
	         }
	      }
	   
	}
}
