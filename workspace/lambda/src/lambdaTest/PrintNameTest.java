package lambdaTest;

public class PrintNameTest {
	
	// 매개 변수가 2개 일 경우에는 () 항상 써줘야함 
	public void printFullName(PrintName printname) {
		System.out.println(printname.getFullName("김", "동한"));
	}
//	
	public static void main(String[] args) {
//		printFullName((firstName,lastName) -> firstName + lastName);
		
		PrintName printName = (firstName, lastName) -> firstName + lastName; 
		System.out.println(printName.getFullName("김","동한"));
		
		
//		강사님 버전
//		PrintNameTest printNameTest = new PrintNameTest();
//		printNameTest.printFullName((f, l) -> f + l);
	}
}