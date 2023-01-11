package collectionTask;

public class User {
   private String name;      // 이름
   private String id;         // 아이디
   private String password;   // 비밀번호
   private String phoneNumber;   // 핸드폰번호
   private int number;         // 인증번호
   
   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public User() {;}

   @Override
   public String toString() {
      return "User [name=" + name + ", id=" + id + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   
   
   
}