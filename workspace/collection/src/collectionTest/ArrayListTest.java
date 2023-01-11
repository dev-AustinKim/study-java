package collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : 제네릭(이름이 없는 -> 어떤 타입을 쓸 지 모르기 때문에)
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		제네릭은 클래스 뒤에 써준다. 제네릭은 무조건 클래스타입만 된다.
//		제네릭을 사용하면 따로 다운캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.
		
		final int SIZE = 9;
		ArrayList<Integer> ar = new ArrayList<Integer>();
//		=(위와 동일) ArrayList<Integer> ar = new ArrayList<>();
		
//		C
//		System.out.println(ar.size()); // 0이 나온다. 아무것도 안넣었기 때문에 size는 0. 하나 넣어주면 size는 1.
		for (int i = 0; i < SIZE; i++) {
			if(i>4) {
				ar.add((14-i)*10);
				System.out.println(ar.size());
				continue;
			}
			ar.add((i+1)*10);
			System.out.println(ar.size());
		}
		
//		R : 조회
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i)); // get은 해당 인덱스의 값을 가져오는 것이다.
		}
		
		// ar자리에 ArrayList 또는 iterator가 온다.
//		단순히 값만 가져올 때는 빠른 for문을 쓴다.(foreach)
//		증감량이 필요할 때에는 for문을 써서 i를 쓰는게 맞다.
//		빠른 for문(forEach, 향상된 for문)
//		사용방법 : for(자료형 변수명 : 순서가 있는 무언가)
//		변수에 하나씩 값이 순서도래 들어간다.
		for (Integer integer/* 변수명 */ : ar) {
			System.out.println(integer);
		}
		
		
		System.out.println("=========================");
//		리턴값을 받아서 할 필요 없이 주소로 접근해서 수정하면 된다. 그래서 바로 쓸 수 있는 것이다.
		Collections.sort(ar); // 원래 ar 자리에 리스트가 들어가야 하는데 arrayList가 list로 업 캐스팅되어서 들어감. 오름차순 정렬 
		Collections.reverse(ar); // sort를 한 다음에 사용하면 내림차순으로 바꿔줌. 좌우를 반대로 바꿔주는 메소드.
		Collections.shuffle(ar); // 섞음
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("1차 끝.");
//		추가(삽입)
//		50뒤에 500 삽입

		if(ar.contains(50)) {
			ar.add(ar.indexOf(50) + 1, 500);
		}
		System.out.println("추가" + ar); // get은 해당 인덱스의 값을 가져오는 것이다.
		
//		수정 
//      90을 9로 수정
//      int prev = 0;
//      if(datas.contains(90)) {
//         prev = datas.set(datas.indexOf(90), 9); ar.set(ar.indexOf(90)까지가 90이다.
//         System.out.println(prev + "이 9로 수정"); 
//         System.out.println(datas);
//      }

		
//		삭제
//		80삭제
//		1. 인덱스로 삭제
		
		int removedData = 0;
		if(ar.contains(80)) {
			removedData = ar.remove(ar.indexOf(80));
		}
		System.out.println(removedData + "삭제");
		System.out.println(ar);
		
//		2. 값으로 삭제
		
		if(ar.remove(Integer.valueOf(80))) {
			System.out.println("삭제 성공");
			System.out.println(ar);
		}
		
	}
}
