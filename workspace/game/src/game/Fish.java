package game;

public class Fish extends GameObject{ // GameObject를 상속받아 Fish 클래스 정의

	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	
	@Override
	protected void move() { // Fish가 한 번 움직이는 과정 전개
		int n = (int)(Math.random()*5);
		if(n==0) x += distance;
		else if(n==1) x -= distance;
		
		if(x < 0) x=0;
		if(x >= Game.MAX_X) x = Game.MAX_X - 1;
		
		n = (int)(Math.random()*5);
		if(n==0) y += distance;
		else if(n==1) y -= distance;
		
		if(y < 0) y=0;
		if(y >= Game.MAX_Y) y= Game.MAX_Y - 1;
	}

	@Override
	protected char getShape() { // Fish의 모양 리턴
		return '@';
	}

}