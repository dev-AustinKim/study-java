package interfaceTest;

// 따지자면 얘도 부모.
public interface Pet {
	public int EYES = 2; // 미리 정해놓는 것이다. 인터페이스는 상수밖에 선언이 안되니까 final static이 int 앞에 생략이 되어 있는 것이다. static을 붙이는 이유 : 모든 객체가 공유하기 위해서.
	public final static int NOSE = 1; // 윗줄과 같은 형식이다.
	
	public void giveYourHand(); // 인터페이스는 추상메소드밖에 사용할 수 없으니까 abstract는 생략되어 있다.
	public abstract void bang(); // 윗줄과 같은 형식이다.
	public void sitDown();
	public void waitNow();
	public void getNose();
}