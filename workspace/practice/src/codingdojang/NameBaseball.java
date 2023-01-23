package codingdojang;

import java.util.Random;
import java.util.Scanner;

/*
 * 0~9까지의 숫자를 한 번씩 사용하여 만든 세 자리 숫자를 맞추는 코드를 작성하시오. 숫자와 자리가 맞으면 S이고 숫자만 맞으면 B입니다.
 * 컴퓨터가 세 자리 숫자를 설정하고 사용자에게 숫자를 입력받아 S와 B의 개수를 알려주십시오. 정답을 맞히면 정답이라고
 * 알려주고 사용자가 숫자를 룰에 어긋나게 입력 시 경고문을 출력하고 다시 숫자를 입력할 수 있게 하십시오.
 * 예) 정답이 123일 때 사용자가 234를 입력 시 0S2B, 사용자가 109를 입력 시 1S0B, 사용자가 327을 입력 시 1S1B입니다.
 */

public class NameBaseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		input과 computer 둘 다 초깃값인 0으로 설정하면 둘 값이 같기 때문에 while문에 애초에 들어가질 않아서 따로 설정해준다.
		int input = 0, computer = 1, ball = 0, strike = 0, count = 0;
		String scomputer = null;
		String[] my = new String[3];
		String[] com = new String[3];

		Random r = new Random();
		while(true) {
			//				random.nextInt(마지막범위)+시작범위
			computer = r.nextInt(999)+100;
			System.out.println(computer);
			scomputer = String.valueOf(computer);
			com = scomputer.split("");
			if(com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
				break;
			}
		}
		while(input != computer) {
			count++;
			strike = 0;
			ball = 0;
			System.out.println("세자리 숫자를 입력하세요.");
			input = sc.nextInt();
			String sinput = String.valueOf(input);
			my = sinput.split(""); // sinput.split("")은 주소값이다.
			for (int i = 0; i < my.length; i++) {
				if (com[i].equals(my[i])) {
					strike += 1;
				} else {
					if (i == 0) {
						if (com[0].equals(my[1]) || com[0].equals(my[2])) {
							ball += 1;
						}
					} else if (i == 1) {
						if (com[1].equals(my[0]) || com[1].equals(my[2])) {
							ball += 1;
						}
					} else if (i == 2) {
						if (com[2].equals(my[1]) || com[2].equals(my[0])) {
							ball += 1;
						}
					}
				}
			}
			// 게임결과 출력
			System.out.printf("%dS %dB\n", strike, ball);			
		}
		System.out.println(count + "번만에 성공했습니다.");
	}
}