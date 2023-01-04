package classTest;

import java.util.Random;

public class RandomTest {
   public static void main(String[] args) {
      Random random = new Random();
//      for (int i = 0; i < 10; i++) {
//         System.out.println(random.nextInt(6));
//      }
      
      // 30% È®·ü·Î 1ÀÌ ³ª¿Â´Ù.
      int[] rating = new int[10];
      int data = 30;
      
      for (int i = 0; i < data / 10; i++) {
         System.out.println(rating[i] = 1);
      }
//      
//      if(rating[random.nextInt(10)] == 1) {
//         System.out.println("´çÃ·");
//      }else {
//         System.out.println("²Î");
//      }
   }
}
