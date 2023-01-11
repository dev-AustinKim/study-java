package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : ���׸�(�̸��� ���� -> � Ÿ���� �� �� �𸣱� ������)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���׸��� Ŭ���� �ڿ� ���ش�. ���׸��� ������ Ŭ����Ÿ�Ը� �ȴ�.
//		���׸��� ����ϸ� ���� �ٿ�ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.
		
		final int SIZE = 9;
		ArrayList<Integer> ar = new ArrayList<Integer>();
//		=(���� ����) ArrayList<Integer> ar = new ArrayList<>();
		
//		C
//		System.out.println(ar.size()); // 0�� ���´�. �ƹ��͵� �ȳ־��� ������ size�� 0. �ϳ� �־��ָ� size�� 1.
		for (int i = 0; i < SIZE; i++) {
			if(i>4) {
				ar.add((14-i)*10);
				System.out.println(ar.size());
				continue;
			}
			ar.add((i+1)*10);
			System.out.println(ar.size());
		}
		
//		R : ��ȸ
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i)); // get�� �ش� �ε����� ���� �������� ���̴�.
		}
		
		// ar�ڸ��� ArrayList �Ǵ� iterator�� �´�.
//		�ܼ��� ���� ������ ���� ���� for���� ����.(foreach)
//		�������� �ʿ��� ������ for���� �Ἥ i�� ���°� �´�.
//		���� for��(forEach, ���� for��)
//		����� : for(�ڷ��� ������ : ������ �ִ� ����)
//		������ �ϳ��� ���� �������� ����.
		for (Integer integer/* ������ */ : ar) {
			System.out.println(integer);
		}
		
		
		System.out.println("=========================");
//		���ϰ��� �޾Ƽ� �� �ʿ� ���� �ּҷ� �����ؼ� �����ϸ� �ȴ�. �׷��� �ٷ� �� �� �ִ� ���̴�.
		Collections.sort(ar); // ���� ar �ڸ��� ����Ʈ�� ���� �ϴµ� arrayList�� list�� �� ĳ���õǾ ��. �������� ���� 
		Collections.reverse(ar); // sort�� �� ������ ����ϸ� ������������ �ٲ���. �¿츦 �ݴ�� �ٲ��ִ� �޼ҵ�.
		Collections.shuffle(ar); // ����
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("1�� ��.");
//		�߰�(����)
//		50�ڿ� 500 ����

		if(ar.contains(50)) {
			ar.add(ar.indexOf(50) + 1, 500);
		}
		System.out.println("�߰�" + ar); // get�� �ش� �ε����� ���� �������� ���̴�.
		
//		���� 
//      90�� 9�� ����
//      int prev = 0;
//      if(datas.contains(90)) {
//         prev = datas.set(datas.indexOf(90), 9); ar.set(ar.indexOf(90)������ 90�̴�.
//         System.out.println(prev + "�� 9�� ����"); 
//         System.out.println(datas);
//      }

		
//		����
//		80����
//		1. �ε����� ����
		
		int removedData = 0;
		if(ar.contains(80)) {
			removedData = ar.remove(ar.indexOf(80));
		}
		System.out.println(removedData + "����");
		System.out.println(ar);
		
//		2. ������ ����
		
		if(ar.remove(Integer.valueOf(80))) {
			System.out.println("���� ����");
			System.out.println(ar);
		}
		
	}
}
