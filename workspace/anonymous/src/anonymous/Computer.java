package anonymous;

public class Computer {
	public static void main(String[] args) {
		//	Game game = new Game(); // 구현하고 올리라고 알려준다.

		//	인터페이스에 구현되지 않은 필드가 존재하기 때문에
		//	익명 클래스가 열린 뒤 인터페이스를 지정하여 구현시킨다.
		//	구현된 익명 클래스의 필드가 메모리에 할당된 뒤 인터페이스 타입의
		//	객체로 up casting된다.
		Game game= new Game() { // 익명클래스. 업 캐스팅 / Game()인터페이스가 메모리에 올라가는 것이 아니라 game이라는 것이 메모리에 올라간다.
			@Override
			public void play() {
				
			}
			
			@Override
			public void exit() {

			}
		};
	}
}