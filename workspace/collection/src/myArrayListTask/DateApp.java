package myArrayListTask;

import java.util.ArrayList;

public class DateApp {
	public static ArrayList<Love> lovers = DBConnecter.lovers;
	
//	사용자 추가
	public void add(Love love) {
		lovers.add(love);
	}
	
//	사용자가 원하는 나이의 이상형 목록 조회
	public Love wantAge(int age) {
		for (Love love : lovers) {
			if(love.getAge()==age) {
				return love;
			}
		}
		return null; //원하는 이상형이 없을 때
	}
	
//	이상형의 나이 수정
	public void changeAge(Love love) {
		love.setAge(love.getAge());
	}
	
//	이상형 나이순 정렬
	
	
//	 객체를 바꿔줄 순 없나? i번쨰 인덱스에 있는 객체의 정보들과 i+1번째 있는 객체의 정보들을 한번에 바꾸게
//	public void sortByAge() {
//		for (int i = 0; i < lovers.size(); i++) {
//			Love temp = new Love();
//			if(lovers.get(i).getAge() > lovers.get(i+1).getAge()) {
//				temp = lovers.get(i);
//				lovers.get(i+1) = lovers.get(i);
//				lovers.get(i).setAge(temp);
//			}
//		}
//	}
}