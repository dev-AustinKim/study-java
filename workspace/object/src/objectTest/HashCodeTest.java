package objectTest;

public class HashCodeTest {
   public static void main(String[] args) {
      String data1 = "ABC";
      String data2 = new String("ABC"); // 위와 동일.
      
      System.out.println(data1);
      System.out.println(data2);
      System.out.println(data1.toString()); // 위와 동일.
      System.out.println(data2.toString());
      
//		여기는 다른 이야기.      
      System.out.println(data2.hashCode());
      System.out.println(data2.hashCode());
      
      
   }
}
