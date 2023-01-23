package codingdojang;

import java.util.Random;
import java.util.Scanner;

/*
 * 0~9������ ���ڸ� �� ���� ����Ͽ� ���� �� �ڸ� ���ڸ� ���ߴ� �ڵ带 �ۼ��Ͻÿ�. ���ڿ� �ڸ��� ������ S�̰� ���ڸ� ������ B�Դϴ�.
 * ��ǻ�Ͱ� �� �ڸ� ���ڸ� �����ϰ� ����ڿ��� ���ڸ� �Է¹޾� S�� B�� ������ �˷��ֽʽÿ�. ������ ������ �����̶��
 * �˷��ְ� ����ڰ� ���ڸ� �꿡 ��߳��� �Է� �� ����� ����ϰ� �ٽ� ���ڸ� �Է��� �� �ְ� �Ͻʽÿ�.
 * ��) ������ 123�� �� ����ڰ� 234�� �Է� �� 0S2B, ����ڰ� 109�� �Է� �� 1S0B, ����ڰ� 327�� �Է� �� 1S1B�Դϴ�.
 */

public class NameBaseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		input�� computer �� �� �ʱ갪�� 0���� �����ϸ� �� ���� ���� ������ while���� ���ʿ� ���� �ʾƼ� ���� �������ش�.
		int input = 0, computer = 1, ball = 0, strike = 0, count = 0;
		String scomputer = null;
		String[] my = new String[3];
		String[] com = new String[3];

		Random r = new Random();
		while(true) {
			//				random.nextInt(����������)+���۹���
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
			System.out.println("���ڸ� ���ڸ� �Է��ϼ���.");
			input = sc.nextInt();
			String sinput = String.valueOf(input);
			my = sinput.split(""); // sinput.split("")�� �ּҰ��̴�.
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
			// ���Ӱ�� ���
			System.out.printf("%dS %dB\n", strike, ball);			
		}
		System.out.println(count + "������ �����߽��ϴ�.");
	}
}