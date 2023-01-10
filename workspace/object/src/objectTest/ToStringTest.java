package objectTest;


class Student {
   private int number;
   private String name;
   
   public Student() {;}
   
   public Student(int number, String name) {
      super();
      this.number = number;
      this.name = name;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Student [number=" + number + ", name=" + name + "]";
   }

   @Override
   public boolean equals(Object obj) { // upcasting 되어서 들어옴
      if(this == obj) { // student와 new Student(1, "김동한")의 주소값 먼저 비교
         return true; // 주소값이 같다면 같을 수 밖에 없으니까 true 리턴.
      }
      
      if(obj instanceof Student) { // 매개변수 obj가 Student타입이니? 물어봄
         Student another = (Student) obj; // 맞다면 다운캐스팅
         if(this.number == another.number) { // 서로의 number가 같다면 true 리턴.
        	 if(this.name == another.name) {
            	 return true;
             }
         }
         
      }
      return false; // 전부 속하지 않는다면 false 리턴.
   }
}

public class ToStringTest {
   public static void main(String[] args) {
      Student 한동석 = new Student();
      
      한동석.setNumber(1);
      한동석.setName("한동석");
      
      System.out.println(한동석);
   }
}


