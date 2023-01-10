package objectTest;

public class EqualsTest {
   public static void main(String[] args) {
      Student student = new Student(1, "±èµ¿ÇÑ");
      boolean check = student.equals(new Student(1, "±èµ¿ÇÑ"));
      System.out.println(check);
   }
}