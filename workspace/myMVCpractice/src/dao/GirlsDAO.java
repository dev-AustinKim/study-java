package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import domain.NameVO;


//public static final String PATH = "salary.txt";
//public static final String BOYPATH = "boyNames.txt";
//public static final String GIRLPATH = "girlNames.txt";

//public static BufferedWriter getWriter() throws IOException {
//	return new BufferedWriter(new FileWriter(PATH));
//}
//public static BufferedWriter getAppend() throws IOException {
//	return new BufferedWriter(new FileWriter(PATH, true));
//}
//public static BufferedReader getReader() throws IOException {
//	return new BufferedReader(new FileReader(PATH));
//}
public class GirlsDAO {
	private final String PATH = "girlNames.txt";

	public ArrayList<NameVO> nameVO = new ArrayList<>();
	
	public ArrayList<NameVO> setObject() throws FileNotFoundException, IOException {
		ArrayList<NameVO> results = new ArrayList<NameVO>(); 
		BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
		
		String line = ""; 
		while ((line = bufferedReader.readLine()) != null) {
			
			NameVO temp = new NameVO();
			temp.setGender("G");
			temp.setName(line.split("	")[0]);
			temp.setRanking(Integer.parseInt(line.split("	")[1]));
			temp.setNameNumber(Integer.parseInt(line.split("	")[2].replaceAll(",", "")));
			
			results.add(temp);
		}
		
		return results;
	}
	
}
