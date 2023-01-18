package view;

import java.io.FileNotFoundException;
import java.io.IOException;

import dao.BoysDAO;
import dao.GirlsDAO;
import dao.TotalDAO;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TotalDAO totalDAO = new TotalDAO();
//		for (int i = 0; i < new BoysDAO().setObject().size(); i++) {
//			System.out.println(new BoysDAO().setObject().get(i));
//		}
//		for (int i = 0; i < new GirlsDAO().setObject().size(); i++) {
//			System.out.println(new GirlsDAO().setObject().get(i));
//		}
		
		
		System.out.println("===============");
		System.out.println();
		System.out.println(totalDAO.overlap());
		System.out.println("===============");
	}
}
