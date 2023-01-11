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

	//   ���̵� �ߺ��˻�
	public User checkId(String id) {
		for (int i = 0; i < memberInfo.size(); i++) {
			if(memberInfo.get(i).getId().equals(id)) {      // DB�� �Է¹��� id�� ��ġ�� ��ü�� ã�Ƽ� �� ��ü�� �ʵ忡 �ִ� id���� �Է¹��� id ���� ��
				//            System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
				return memberInfo.get(i);
			}
		}
		//      System.out.println("��� ������ ���̵� �Դϴ�.");
		return null;
	}

	//   ȸ������
	public boolean signUp(User user) { // user�� �޴´�.
		
		memberInfo.add(user);                  // ArrayList�� user��ü�� �߰�
		System.out.println("ȸ������ ����");
		return true;
	}


	//   �α���
	public boolean login(String id, String password) {
		if(checkId(id) != null) {   // ���̵� �ߺ��˻縦 ���� �� false�� ������ ������� ���̵� �ִ� ��
			if(checkId(id).getPassword().equals(encryption(password))) {   // �α����� �� ����ڰ� �Է��� password�� ��ȣȭ�ؼ� ���� ������� password�� ������ ��
				System.out.println("�α��� ����");
				return true;
			}
		}
		System.out.println("�α��� ����");
		return false;
	}

	//   ��ȣȭ

	public String encryption(String password) {
		String result = "";
		for (int i = 0; i < password.length(); i++) {
			result += (char)(password.charAt(i) * KEY);
		}
		return result;
	}



	//   ��й�ȣ ����(��й�ȣ ã�� ����)

	public String changePassword(String id, String newPassword, int number) {
		if(checkId(id).getNumber() == number) {   // ������ȣ Ȯ��
			System.out.println("������ȣ�� ��ġ�մϴ�.");
			System.out.println("��й�ȣ ���� ����");
			checkId(id).setPassword(encryption(newPassword));   // ����ڰ� �Է��� ������ ��й�ȣ�� ��ȣȭ�ؼ� �־��ش�.
			System.out.println("��й�ȣ�� " + newPassword + "�� ����Ǿ����ϴ�.");
			return newPassword;
		}
		System.out.println("������ȣ�� ��ġ���� �ʽ��ϴ�.");
		System.out.println("��й�ȣ ���� ����");
		return null;
	}

	//   ������ȣ ���� // �ڵ�����ȣ�� ������ �ȴ�.
	public int checkPhone(String id, String phoneNumber) {
		Random rd = new Random();
		int number = 0;
		if(checkId(id).getPhoneNumber().equals(phoneNumber)) {   // ����ڰ� �Է��� id�� phoneNumber�� ��ġ�ϸ� 100000~999999������ ������ ������ȣ ����
			number = rd.nextInt(899999) + 100000;   
			//         number = 123456;   // �׽�Ʈ��
			checkId(id).setNumber(number);
			System.out.println("������ȣ : " + number);


			//            String api_key = "NCST8GJILHI0RWXP";
			//             String api_secret = "21JWKCCJQHVDS73MU3OBYIADELGUWMED";
			//             Message coolsms = new Message(api_key, api_secret);
			//
			//             // 4 params(to, from, type, text) are mandatory. must be filled
			//             HashMap<String, String> params = new HashMap<String, String>();
			//             params.put("to", phoneNumber);
			//             params.put("from", "01056337014");
			//             params.put("type", "SMS");
			//             params.put("text", "������ȣ�� " + number + " �Դϴ�.");
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
		System.out.println("�Է��Ͻ� ���� Ȯ�����ּ���.");
		System.out.println("������ȣ ���� ����");
		return 0;
	}
}