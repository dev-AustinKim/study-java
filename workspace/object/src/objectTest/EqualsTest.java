package objectTest;

public class EqualsTest {
   public static void main(String[] args) {
      Student student = new Student(1, "�赿��");
      boolean check = student.equals(new Student(1, "�赿��"));
      System.out.println(check);
   }
}