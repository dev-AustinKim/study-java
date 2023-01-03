package methodTest;

public class Test {
	void change(int[] data) {	// 주소 값을 받아오는 것이다.	
		data[0] = 20; //data가 있는 주소에 가서 바꾼 것이다.
	}
	
	public static void main(String[] args) {
		int[] data = {10};
		new Test().change(data); // data 라는 배열의 주소값을 보내주는 것이다. / new Test()는 값으로 봐라.
		System.out.println(data[0]); // 주소로 접근해서 바꾼 다음에 출력하는 것이기 때문에 data[0]의 값은 10에서 20으로 바뀌어있다.
	}
}
