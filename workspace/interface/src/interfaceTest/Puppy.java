package interfaceTest;

public class Puppy implements Pet { // 인터페이스는 다중상속 가능.

	@Override
	public void giveYourHand() {
		System.out.println("여기요!");

	}

	@Override
	public void bang() {
		System.out.println("눕는다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("앉는다.");

	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("기다린다.");

	}

	@Override
	public void getNose() {
		// TODO Auto-generated method stub
		System.out.println("손가락에 코를 넣는다.");
		
	}

}
