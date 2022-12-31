package myBank;

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
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void deposit(int monet) {
		this.money += money;		
	}
	
	public void checkSameAccount() {
		
	}
	
	public void login() {
		
	}
	
	public void checkSamePhone() {
		
	}
}
