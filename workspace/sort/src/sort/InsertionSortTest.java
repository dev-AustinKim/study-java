package sort;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class InsertionSortTest {

	public static void main(String[] args) throws Exception {
		String temp = "";
		// Student.txt는 개인정보로 인해 첨부하지 않음.
		File file = new File("Student.txt");
		ArrayList<Stud> arrl = new ArrayList<>();
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		while((temp = br.readLine()) != null) {
			String[] str = temp.split(" ");
			Stud record = new Stud();
			record.id = Integer.parseInt(str[0]);
			record.name = str[1];
			record.addr = str[2];
			arrl.add(record);
		}
		InsertionSort so = new InsertionSort();
		so.insertionSort(arrl,9);
	}
}
