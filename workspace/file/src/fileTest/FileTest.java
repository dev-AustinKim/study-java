package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	//	메소드에 throws IOException을 하면 이 메소드 안에서는 몇번의 IOException이 발생해도 오류가 나지 않는다.
	//	즉, 발생할 때마다 계속 try-catch로 잡을 필요가 없어지며 이 메소드에서는 IOException이 발생하지 않는다.

	public static void main(String[] args) throws IOException{
		//		절대 경로 : 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
		//		상대 경로 : 현재 위치에 따라 변경되는 경로, ../a/b


		//		BufferedWriter의 default는 덮어쓰기. 이렇게만 쓰면 덮어쓰기이다.
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt")); //"./text.txt"이다. 항상 ./이 생략되는 것이다.
		//		BufferedWriter의 이어쓰기. true를 줘서 이어서 쓰게 만들었다.
		//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt",true)); //"./text.txt"이다. 항상 ./이 생략되는 것이다.

		bufferedWriter.write("안녕"); // default가 덮어쓰기
		bufferedWriter.close(); // 다 썼으면 무조건 close를 해주자.
		
		 BufferedReader bufferedReader = null; 
	      try {
	         bufferedReader = new BufferedReader(new FileReader("src/test.txt"));
	         String line = null;
	         while((line = bufferedReader.readLine()) != null) {
	            System.out.println(line);
	         }
	      } catch (FileNotFoundException e) {
	         System.out.println("잘못된 경로");
	      } finally {
	         if(bufferedReader != null) {
	            bufferedReader.close();
	         }
	      }
	      
//	      성능 저하 및 다양한 결함이 발생하여, 9버전 이후 부터는 사용하지 말고 close()를 쓰자!
//	      System.gc();
//	      System.runFinalization();
	      
//	      File file = new File("src/test.txt");
//	      if (file.exists()) {
//	         file.delete();
//	      }
	   }
	}
