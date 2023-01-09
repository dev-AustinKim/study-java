package interfaceTest;

public class Cat implements Pet {

	@Override
	public void giveYourHand() {
		// TODO Auto-generated method stub
		System.out.println("안준다");

	}

	@Override
	public void bang() {
		// TODO Auto-generated method stub
		System.out.println("못들은 척 한다.");

	}

	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("무시한다.");

	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("안기다린다.");

	}

	@Override
	public void getNose() {
		// TODO Auto-generated method stub
		System.out.println("하악질을 한다.");

	}

}
