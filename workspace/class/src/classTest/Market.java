package classTest;

class Company {
	static Long sequence; // ��� ������� ������ �� �ִ� ���̵� �ʿ��ؼ� static���� ���� ���̴�.
	static Long total;
	
	Long id;
	String name;
	Long salary;
	int income;
	
	static { // �ʱ�ȭ ���, static���� ����� ���� static ������� ���� ���� �ʱ�ȭ ��Ų��.
		total = 0L;
		sequence = 0L;
	}
	
	
//	 �ʱ�ȭ ���.
//	�����ڰ� ȣ��� ������ ����.
	
	{
//		id++; // �� �ϸ� ��� ȸ���� ��ȣ�� 1�� ���´�.
		id = ++sequence; 
	}
	
	public Company(String name, Long salary) { // Alt + Shift + O
		this.name = name;
		this.salary = salary;
	}
	
	
	void printMyData() {
		System.out.println(id + ", " + name + ", �� " + salary + "����");
	}
	
}

public class Market {
	public static void main(String[] args) {
		Company �赿�� = new Company("�赿��",4000L);
		Company ȫ�浿 = new Company("ȫ�浿",5000L);
		Company �� = new Company("��",6000L);
		Company �� = new Company("��",7000L);
		Company �� = new Company("��",8000L);
//		�赿��.printMyData();	
		
//		Company.total += �赿��.income = 1000;
//		Company.total += �赿��.income = 2000;
//		Company.total += ��.income = 4000;
//		Company.total += ��.income = 8000;
		
//		���� ���� �ؿ� �ɷ� �ٲ�� �Ѵ�. �� ������ ���� ����� �ι��� ������ �����ٸ�
//		���� ��ó�� ���شٸ� �赿���� ������ 1000�� 2000�� �ѹ����� ���ؾ� �ϴµ� 1000�� 3000�� �������� �����̴�.
		
		Company.total += �赿��.income;
		Company.total += ��.income;
		System.out.println(Company.total + "����");
		
	}	
}