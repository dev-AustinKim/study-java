package lambdaTest;

public class PrintNameTest {
	
	// �Ű� ������ 2�� �� ��쿡�� () �׻� ������� 
	public void printFullName(PrintName printname) {
		System.out.println(printname.getFullName("��", "����"));
	}
//	
	public static void main(String[] args) {
//		printFullName((firstName,lastName) -> firstName + lastName);
		
		PrintName printName = (firstName, lastName) -> firstName + lastName; 
		System.out.println(printName.getFullName("��","����"));
		
		
//		����� ����
//		PrintNameTest printNameTest = new PrintNameTest();
//		printNameTest.printFullName((f, l) -> f + l);
	}
}