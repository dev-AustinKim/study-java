package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnecter {
   public static final String PATH = "salary.txt";
   
   public static BufferedWriter getWriter() throws IOException { // 덮어쓰기
      return new BufferedWriter(new FileWriter(PATH));
   }
   
   public static BufferedWriter getAppend() throws IOException { // 이어쓰기
      return new BufferedWriter(new FileWriter(PATH, true));
   }
   
   public static BufferedReader getReader() throws IOException { // 읽기
      return new BufferedReader(new FileReader(PATH));
   }
}



