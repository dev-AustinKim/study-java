package game;

//1. 게임에는 Bear와 Fish라는 두 개의 객체가 필요하다.
//2. 이들은 10행 20열의 격자판에서 각각 정해진 규칙에 의해 움직인다.
//	Bear는 사용자 입력키(a: 왼쪽, d: 오른쪽, w: 위, x: 아래)에 따라 한 칸씩 움직인다.
//	Fish는 다섯 번 중 세 번은 제자리에, 나머지 두 번은 네 가지 방향 중 랜덤하게 한칸씩 움직인다. 
//3. 게임은 Bear가 Fish를 먹으면(같은 칸에 도착하면) 끝난다.	



public class Game {
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	private char map[][] = new char[MAX_Y][MAX_X];
	private GameObject [] m = new GameObject[2];
	int state; // 0: 게임 중, 1: Fish 승리, 2: Bear 승리

	public Game() {
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 0; j < MAX_X; j++) { 
				map[i][j] = '-';
			}
		}
		m[0] = new Bear(0, 0, 1);
		m[1] = new Fish(5, 5, 2);
		state = 0; // 게임 중
	}

	public void run() {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.");
		update(); // 초기 좌표에 따른 맵 설정
		draw(); // 초기 게임 맵을 보여줌
		while(!doesEnd()) {
			clear(); // 현재의 맵 지움
			for(int i = 0; i< m.length; i++) {
				m[i].move();
			}
			update(); // 움직인 후 좌표 변경에 따른 맵 갱신
			draw(); // 맵 그리기
		}
		System.out.println("#### Bear Wins!! ####");
	}
	private void update() {
		for(int i=m.length-1; i>=0; i--)
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
	}
	private void clear() {
		for(int i=0; i<m.length; i++)
			map[m[i].getY()][m[i].getX()] = '-';
	}
	private void draw() {
		System.out.println();
		for(int i=0; i<MAX_Y; i++) {
			for(int j=0; j<MAX_X; j++)
				System.out.print(map[i][j]);
			System.out.println();
		}
	}
	private boolean doesEnd() {
		if(m[0].collide(m[1])) { return true; }
		return false;
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}
}
