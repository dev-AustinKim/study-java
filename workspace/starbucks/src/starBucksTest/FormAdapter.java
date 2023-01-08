package starBucksTest;

public abstract class FormAdapter implements Form { // FormAdapter는 Form 타입이다. upcasting이다.
	@Override
	public void sell(String menu) {;} // getmunu() 메소드는 강제성을 남긴것이고 sell은 재정의 해주면서 강제성을 없앤 것이다.
}
