package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2, 4, 5, 6, 8};
		System.out.println(arData); // 주소 값 출력.
		System.out.println(arData.length); // 길이 출력.
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arData[i]);
		}	
//		5, 4, 3, 2, 1을 넣고 출력
		int[] arData2 = { 5, 4, 3, 2, 1 };
		for (int i = 0; i < 5; i++) {
			System.out.print(arData2[i] + " ");
		}
		System.out.println();
		// 강사님 버전
		for (int i = 0; i < 5; i++) {
			arData[i] = 5-i;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(arData[i] + " ");
		}
	}
}