package classTest;

class Company {
	static Long sequence; // 모든 사람들이 공유할 수 있는 아이디가 필요해서 static으로 만든 것이다.
	static Long total;
	
	Long id;
	String name;
	Long salary;
	int income;
	
	static { // 초기화 블록, static으로 선언된 값은 static 블록으로 따로 만들어서 초기화 시킨다.
		total = 0L;
		sequence = 0L;
	}
	
	
//	 초기화 블록.
//	생성자가 호출될 때마다 실행.
	
	{
//		id++; // 를 하면 모든 회원의 번호가 1이 나온다.
		id = ++sequence; 
	}
	
	public Company(String name, Long salary) { // Alt + Shift + O
		this.name = name;
		this.salary = salary;
	}
	
	
	void printMyData() {
		System.out.println(id + ", " + name + ", 연 " + salary + "만원");
	}
	
}

public class Market {
	public static void main(String[] args) {
		Company 김동한 = new Company("김동한",4000L);
		Company 홍길동 = new Company("홍길동",5000L);
		Company 가 = new Company("가",6000L);
		Company 나 = new Company("나",7000L);
		Company 다 = new Company("다",8000L);
//		김동한.printMyData();	
		
//		Company.total += 김동한.income = 1000;
//		Company.total += 김동한.income = 2000;
//		Company.total += 가.income = 4000;
//		Company.total += 가.income = 8000;
		
//		위에 것을 밑에 걸로 바꿔야 한다. 그 이유는 같은 사람이 두번을 나눠서 벌었다면
//		위에 것처럼 해준다면 김동한이 벌었던 1000과 2000을 한번씩만 더해야 하는데 1000과 3000이 더해지기 때문이다.
		
		Company.total += 김동한.income;
		Company.total += 가.income;
		System.out.println(Company.total + "만원");
		
	}	
}