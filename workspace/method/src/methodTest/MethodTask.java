package methodTest;

public class MethodTask {
//   1~10까지 println()으로 출력하는 메소드
   void printFrom1To10() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }

//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int count) {
      for (int i = 0; i < count; i++) {
         System.out.println("홍길동");
      }
   }

//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int count) {
      for (int i = 0; i < count; i++) {
         System.out.println(name);
      }
   }

//   세 정수의 뺄셈을 해주는 메소드
   int sub(int number1, int number2, int number3) {
      int result = number1 - number2 - number3;
      return result;
   }

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
   int[] div(int number1, int number2) {
//	   주소 값의 초기값은 null이다.
      int[] result = null; // 몇칸인지도 모르고 나중에 인트형 배열을 쓸 것이라고 선언만 해준 것이다.      
//      int[] result = new int[2];  
      
      if (number2 != 0) {
         result = new int[2]; // 배열엔 시작 주소가 들어간다.
         result[0] = number1 / number2;
         result[1] = number1 % number2;
      }
      return result; // 시작주소를 리턴한다.
   }

//   1~n까지의 합을 구해주는 메소드
   int getTotalFrom1(int end) {
      int total = 0;
      for (int i = 0; i < end; i++) {
         total += i + 1;
      }
      return total;
   }

//   홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
   int change(int number) {
      return ++number;
   }

//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   String changeToUpperOrLower(String str) {
      String result = "";
      for (int i = 0; i < str.length(); i++) {
         char c = str.charAt(i);
         if (c >= 65 && c <= 90) {
            result += (char) (c + 32);

         } else if (c >= 97 && c <= 122) {
            result += (char) (c - 32);

         } else {
            result += c;
            
         }
      }
      return result;
   }

//   문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
   int getCount(String str, char c) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == c) {
            count++;
         }
      }
      return count;
   }

//   5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
   int getValue(int[] arData, int index) {
      return arData[index];
   }

//   한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
   int changeToInteger(String hangle) {
      String hangleOriginal = "공일이삼사오육칠팔구";
      String result = "";
      for (int i = 0; i < hangle.length(); i++) {
         result += hangleOriginal.indexOf(hangle.charAt(i));
      }
      return Integer.parseInt(result);
    }

//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   int[] getMaxAndMin(int[] arData) {
      int[] result = {arData[0], arData[0]};
      
      for (int i = 0; i < arData.length; i++) {
         if(result[0] < arData[i]) {result[0] = arData[i];} 
         if(result[1] > arData[i]) {result[1] = arData[i];} 
      }
      return result;
   }
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
   void getMaxAndMin(int[] arData, int[] result) {
      result[0] = arData[0];
      result[1] = arData[0];
      
      for (int i = 0; i < arData.length; i++) {
         if(result[0] < arData[i]) {result[0] = arData[i];} 
         if(result[1] > arData[i]) {result[1] = arData[i];} 
      }
   }
   
//   indexOf() 만들기
//   문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는지 검사하고
//   만약 해당 문자가 없으면 -1을 리턴한다.
   
//   int myIndexOf(String s, char c) {
//	   int result = 0;
//	   for (int i = 0; i < s.length(); i++) { // 문자열 길이까지 반복문 진행
//		   if(s.charAt(i)==c) { // 문자열의 i번째 있는 문자를 c와 비교
//			   result = i; // result에 i(인덱스 번호) 저장.
//		   } else {
//			   if(i==s.length()) // 문자열 길이까지 다 반복했는데 찾는 값이 없으면
// 				   return -1; // -1 리턴.
//		   }
//	   }
//	   return result; // 있으면 result 리턴.
//   }

//   강사님 버전.
   int myIndexOf(String s, char c) {
	   int result = 0;
	   for (int i = 0; i < s.length(); i++) { // 문자열 길이까지 반복문 진행
		   if(s.charAt(i)==c) { // 문자열의 i번째 있는 문자를 c와 비교
			   return i; // result에 i(인덱스 번호) 저장.
		   } 
	   }
	   return -1; // 있으면 result 리턴.
   }
   
   public static void main(String[] args) {
      MethodTask methodTask = new MethodTask();
//      methodTask는 new MethodTask()라는 메소드의 주소값을 넣어준 것이다.
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);
//      methodTask.printName("한동석", 5);
//      System.out.println(methodTask.sub(5, 5 , 10));
//      int[] result = methodTask.div(10, 0); // methodTask.div(10, 0)라는 것으로 주소 값을 받아와서 result배열에 넣어준다.
//      따라서 main의 result[0]은 이제 div의 result[0]의 값과 같아진다.
//      if (result == null) {
//         System.out.println("0으로 나눌 수 없습니다.");
//      } else {
//         System.out.println("몫: " + result[0]);
//         System.out.println("나머지: " + result[1]);
//      }
//      int[] result = new int[2]; // null을 사용하면 주소값이 없는 것이기 때문에 선언을 null로 해주면 안된다.
//      int[] arData = {3, 5, 6, 2, 1};
//      methodTask.getMaxAndMin(arData, result);
//      System.out.println("최대값: " + result[0]);
//      System.out.println("최소값: " + result[1]);
      System.out.println(methodTask.myIndexOf("ABCDE", 'E'));
   }
}