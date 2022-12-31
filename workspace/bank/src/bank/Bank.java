package bank;

public class Bank {
	
	private String name;
	private String account;
	private String phoneNumber;
	private String password;
	private int money;
	
	public Bank() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
//	입금
	public void deposit(int money) {
		this.money += money;
	}
	
//	출금
	public void withdraw(int money) {
		this.money -= money;
	}
	
//	잔액 조회
	public int showBalance() {
		return money;
	}
	
//	계좌번호 중복검사
//	static 메소드를 쓴다면 객체가 생성되기 전에도 사용할 수 있다.
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) { // static으로 선언해서 첫 손님이 올라가기 전에 checkAccount 메소드를 이미 메모리에 올려놓는다.
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0; // j != arCount[i]에서도 쓸 수 있게 해주기 위해서.
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getAccount().equals(account)) {
					bank = arrBank[i][j];
					break;
				}
			}
			if(j != arCount[i]) {break;} // 위에 break를 만나면 j가 arCount[i]까지 증가를 못한다. 따라서 옳게된 조건이라면 반복문을 그냥 나가게 만들려고 한 것이다.
		}
		return bank;
	}
	
//	핸드폰 번호 중복 검사
	public static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {
					bank = arrBank[i][j];
					break;
				}
			}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	로그인
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}


/* public class Task3
 * 	public static Calculator add = (num1, num2) -> num1 + num2;
	public static Calculator sub = (num1, num2) -> num1 - num2;
	
	
	static을 붙이지 않았다면 main에서 Task3 task3 = new Task3(); => task3.add()로 써야 하는데
	static을 붙여주므로 인해서 객체 생성을 하지 않고 사용할 수 있기 때문에
	Task3.add(num1,num2);로 사용할 수 있다.
 */



