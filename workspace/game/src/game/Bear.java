package game;

import java.util.Scanner;

public class Bear extends GameObject{
	private Scanner scanner;

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		scanner = new Scanner(System.in);
	}
	
	
	@Override
	protected void move() { // Bear�� �̵� ����
		System.out.println("����(a), ������(d), ��(w), �Ʒ�(x) >> ");
		char c;
//		����ڰ� �Է��� ���߿� ���� ù ���ڸ� �����´�.
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
	protected char getShape() { // Bear�� ��� ����
		return 'B';
	}
}
