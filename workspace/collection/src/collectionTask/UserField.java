package collectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public static final int KEY = 3;
	//   ArrayList<User> memberInfo = new ArrayList();
	public ArrayList<User> memberInfo = DBConnecter.users; 

	//   아이디 중복검사
	public User checkId(String id) {
		for (int i = 0; i < memberInfo.size(); i++) {
			if(memberInfo.get(i).getId().equals(id)) {      // DB에 입력받은 id와 일치한 객체를 찾아서 그 객체의 필드에 있는 id값과 입력받은 id 값을 비교
				//            System.out.println("중복된 아이디가 있습니다.");
				return memberInfo.get(i);
			}
		}
		//      System.out.println("사용 가능한 아이디 입니다.");
		return null;
	}

	//   회원가입
	public boolean signUp(User user) { // user로 받는다.
		
		memberInfo.add(user);                  // ArrayList에 user객체를 추가
		System.out.println("회원가입 성공");
		return true;
	}


	//   로그인
	public boolean login(String id, String password) {
		if(checkId(id) != null) {   // 아이디 중복검사를 했을 때 false가 나오면 사용중인 아이디가 있는 것
			if(checkId(id).getPassword().equals(encryption(password))) {   // 로그인할 때 사용자가 입력한 password를 암호화해서 실제 사용자의 password와 같은지 비교
				System.out.println("로그인 성공");
				return true;
			}
		}
		System.out.println("로그인 실패");
		return false;
	}

	//   암호화

	public String encryption(String password) {
		String result = "";
		for (int i = 0; i < password.length(); i++) {
			result += (char)(password.charAt(i) * KEY);
		}
		return result;
	}



	//   비밀번호 변경(비밀번호 찾기 서비스)

	public String changePassword(String id, String newPassword, int number) {
		if(checkId(id).getNumber() == number) {   // 인증번호 확인
			System.out.println("인증번호가 일치합니다.");
			System.out.println("비밀번호 변경 성공");
			checkId(id).setPassword(encryption(newPassword));   // 사용자가 입력한 변경할 비밀번호를 암호화해서 넣어준다.
			System.out.println("비밀번호가 " + newPassword + "로 변경되었습니다.");
			return newPassword;
		}
		System.out.println("인증번호가 일치하지 않습니다.");
		System.out.println("비밀번호 변경 실패");
		return null;
	}

	//   인증번호 전송 // 핸드폰번호만 받으면 된다.
	public int checkPhone(String id, String phoneNumber) {
		Random rd = new Random();
		int number = 0;
		if(checkId(id).getPhoneNumber().equals(phoneNumber)) {   // 사용자가 입력한 id와 phoneNumber가 일치하면 100000~999999사이의 랜덤한 인증번호 리턴
			number = rd.nextInt(899999) + 100000;   
			//         number = 123456;   // 테스트용
			checkId(id).setNumber(number);
			System.out.println("인증번호 : " + number);


			//            String api_key = "NCST8GJILHI0RWXP";
			//             String api_secret = "21JWKCCJQHVDS73MU3OBYIADELGUWMED";
			//             Message coolsms = new Message(api_key, api_secret);
			//
			//             // 4 params(to, from, type, text) are mandatory. must be filled
			//             HashMap<String, String> params = new HashMap<String, String>();
			//             params.put("to", phoneNumber);
			//             params.put("from", "01056337014");
			//             params.put("type", "SMS");
			//             params.put("text", "인증번호는 " + number + " 입니다.");
			//             params.put("app_version", "test app 1.2"); // application name and version
			//
			//             try {
			//               JSONObject obj = (JSONObject) coolsms.send(params);
			//               System.out.println(obj.toString());
			//             } catch (CoolsmsException e) {
			//               System.out.println(e.getMessage());
			//               System.out.println(e.getCode());
			//             }
			return number;
		}
		System.out.println("입력하신 값을 확인해주세요.");
		System.out.println("인증번호 전송 실패");
		return 0;
	}
}