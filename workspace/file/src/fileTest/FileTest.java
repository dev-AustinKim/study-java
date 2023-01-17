package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	//	�޼ҵ忡 throws IOException�� �ϸ� �� �޼ҵ� �ȿ����� ����� IOException�� �߻��ص� ������ ���� �ʴ´�.
	//	��, �߻��� ������ ��� try-catch�� ���� �ʿ䰡 �������� �� �޼ҵ忡���� IOException�� �߻����� �ʴ´�.

	public static void main(String[] args) throws IOException{
		//		���� ��� : ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
		//		��� ��� : ���� ��ġ�� ���� ����Ǵ� ���, ../a/b


		//		BufferedWriter�� default�� �����. �̷��Ը� ���� ������̴�.
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt")); //"./text.txt"�̴�. �׻� ./�� �����Ǵ� ���̴�.
		//		BufferedWriter�� �̾��. true�� �༭ �̾ ���� �������.
		//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt",true)); //"./text.txt"�̴�. �׻� ./�� �����Ǵ� ���̴�.

		bufferedWriter.write("�ȳ�"); // default�� �����
		bufferedWriter.close(); // �� ������ ������ close�� ������.
		
		 BufferedReader bufferedReader = null; 
	      try {
	         bufferedReader = new BufferedReader(new FileReader("src/test.txt"));
	         String line = null;
	         while((line = bufferedReader.readLine()) != null) {
	            System.out.println(line);
	         }
	      } catch (FileNotFoundException e) {
	         System.out.println("�߸��� ���");
	      } finally {
	         if(bufferedReader != null) {
	            bufferedReader.close();
	         }
	      }
	      
//	      ���� ���� �� �پ��� ������ �߻��Ͽ�, 9���� ���� ���ʹ� ������� ���� close()�� ����!
//	      System.gc();
//	      System.runFinalization();
	      
//	      File file = new File("src/test.txt");
//	      if (file.exists()) {
//	         file.delete();
//	      }
	   }
	}
