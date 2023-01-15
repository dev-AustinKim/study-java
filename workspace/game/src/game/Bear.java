package game;

import java.util.Scanner;

public class Bear extends GameObject{
	private Scanner scanner;

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		scanner = new Scanner(System.in);
	}
	
	
	@Override
	protected void move() { // Bear의 이동 정의
		System.out.println("왼쪽(a), 오른쪽(d), 위(w), 아래(x) >> ");
		char c;
//		사용자가 입력한 것중에 제일 첫 글자만 가져온다.
		c = scanner.next().charAt(0);
		switch(c) {
		case 'a' :
			x--;
			if(x<0) x = 0;
			break;
		case 'd' :
			x++;
			if(x>=Game.MAX_X) x = Game.MAX_X-1;
			break;
		case 'w' :
			y--;
			if(y<0) y = 0;
			break;
		case 'x' :
			y++;
			if(y>=Game.MAX_Y) y = Game.MAX_Y-1;
			break;
			
		}
	}


	@Override
	protected char getShape() { // Bear의 모양 리턴
		return 'B';
	}
}
