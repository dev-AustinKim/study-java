package starBucksTest;

// 스타벅스 본사
public class Starbucks {
//	지점들이 처음에 한 번 등록할 때
//	본사에서 정해놓은 양식을 작성하여 form으로 전달한다.
	public void register(Form form) { // 지점별로 들어오는 form이 다르다.
//		지점에서 메뉴판 문제 없는지 검사
		String[] menu = form.getMenu(); // building에서 작성한 것을 본사(Starbucks 클래스)에서 바로 받아서 사용한 것이다.
		for (int i = 0; i < menu.length; i++) { 
			System.out.println(menu[i]);
		}
		
//		만약 무료나눔매장일 경우에는
		if(form instanceof FormAdapter) { 
			System.out.println("무료나눔 매장입니다.");
			return;
		}
//		정상 판매 매장일 경우 판매 방식 검사.
		form.sell("아메리카노"); 
	}
}