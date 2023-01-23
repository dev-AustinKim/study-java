package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
	//   추가
	public void insert(SalaryVO salaryVO) throws IOException{
//		사람들의 정보를 이어쓰기 위해 선언
		BufferedWriter bufferedWriter = DBConnecter.getAppend();
//		content 문자열에 DBConnecter의 salary.txt의 경로를 path로 받아서 전부 넣어준다.
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String temp = null;
//		temp에 
		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
		temp += salaryVO.toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

	//   수정(소득세)
	public void update(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

//		line 문자열에 DBConnecter에서 읽어온 한줄을 넣고 그 한줄이 없지 않으면 반복
		while((line = bufferedReader.readLine()) != null) {
//			만약 line 문자열을 "   "기준으로 나눈 0번째 방에 있는 값이 salaryVO의 Salary의 금액에 ,를 넣은 값과 같다면 
			if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "만원")) {
//				data 문자열에 line문자열 0번째 인덱스에서 line문자열 끝에서 "   "를 처음 발견한 곳까지의 내용을 저장. 
				String data = line.substring(0, line.lastIndexOf("   "));

//				temp에 data의 0번째 인덱스에서 data 문자열 끝에서 "   "를 처음 발견한 곳까지의 내용을 더해준다.
				temp += data.substring(0, data.lastIndexOf("   ")) + "   " 
//						소득세의 , 해준 내용을 더해준다.
						+ insertComma(salaryVO.getIncomeTax()) + "   "
//						지방 소득세의 , 해준 내용을 더해주고 줄바꿈을 한다.
						+ insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
			}
//			if문 안에 들어가지 않았다면 line의 내용 그대로를 temp에 더해가면서 넣어준다.
			temp += line + "\n";
		}
//		bufferedWriter에 덮어쓰기를 대입해주고
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
//		temp를 덮어쓴다.
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();
	}
	//   삭제
	public void delete(int salary) throws IOException {
		
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";
//		line에 한줄씩 읽어온 내용을 넣어주며 그게 null이 아니라면 반복
		while((line = bufferedReader.readLine()) != null) {
//			salary에 ,를 넣어준 값과 line을 "   " 기준으로 나눠준 것중에 0번째 인덱스가 같다면 if문 진입
			if((insertComma(salary)+"만원").equals(line.split("   ")[0])) {
//				다음 반복으로 넘어감.
				continue;
			}
//			temp에 line(한줄씩)을 계속 더해준다.
			temp += line + "\n";
		}
				
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
//		bufferedWriter에 temp를 덮어써준다.
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();
	}
	
	//   조회
	public SalaryVO find(int salary) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		
		String line = null;
//		salaryVO 객체를 선언.
		SalaryVO salaryVO = new SalaryVO();
//		line에 한줄씩 읽어온 줄을 넣어주고 그게 null이 아니면
		while((line = bufferedReader.readLine()) != null) {
//			salary에 ,를 넣어주면서 line을 "   "기준으로 나눈 0번째 방과 같다면 if문 진입
			if((insertComma(salary)+"만원").equals(line.split("   ")[0])) {							
//				line문자열에 "   "기준으로 나눈 0번째 방에 "만원"기준으로 나눈 0번째 방에 replaceAll을 사용해서 ,을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 Salary에 넣어준다.
				salaryVO.setSalary(Integer.parseInt(line.split("   ")[0].split("만원")[0].replaceAll(",", "")));
				
//				line문자열에 "   "을 기준으로 나눴을 때 1번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 NetPay에 넣어준다.
				salaryVO.setNetPay(Integer.parseInt(line.split("   ")[1].replaceAll(",", "")));
				
//				line문자열에 "   "을 기준으로 나눴을 때 2번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 TaxDeductionAmount에 넣어준다.				
				salaryVO.setTaxDeductionAmount(Integer.parseInt(line.split("   ")[2].replaceAll(",", "")));
				
//				line문자열에 "   "을 기준으로 나눴을 때 3번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 Pension에 넣어준다.								
				salaryVO.setPension(Integer.parseInt(line.split("   ")[3].replaceAll(",", "")));
				
//				line문자열에 "   "을 기준으로 나눴을 때 4번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 HealthInsurance에 넣어준다.												
				salaryVO.setHealthInsurance(Integer.parseInt(line.split("   ")[4].replaceAll(",", "")));
				
//				line문자열에 "   "을 기준으로 나눴을 때 5번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 LongTermCarePay에 넣어준다.													            
				salaryVO.setLongTermCarePay(Integer.parseInt(line.split("   ")[5].replaceAll(",", "")));
				
//				line문자열에 "   "을 기준으로 나눴을 때 6번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 EmploymentInsurance에 넣어준다.													            	            
				salaryVO.setEmploymentInsurance(Integer.parseInt(line.split("   ")[6].replaceAll(",", "")));

//				line문자열에 "   "을 기준으로 나눴을 때 7번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 IncomeTax에 넣어준다.													            	            
				salaryVO.setIncomeTax(Integer.parseInt(line.split("   ")[7].replaceAll(",", "")));
	            
//				line문자열에 "   "을 기준으로 나눴을 때 8번째 방에서 replaceAll을 사용해서 , 을 전부 빈 문자열로 바꿔준 것을 int로 바꿔서 salaryVO의 LocalTax에 넣어준다.													            	            
				salaryVO.setLocalTax(Integer.parseInt(line.split("   ")[8].replaceAll(",", "")));			
				
//				salaryVO에 리턴해준다.
				return salaryVO;
			}
		}

		bufferedReader.close();
//		읽어올 줄이 한줄도 없다면 그냥 null을 리턴해준다.
		return null;
	}
	

	//   목록
	public void list() throws IOException {
//		content 문자열에 DBConnecter.PATH(salary.txt) 전체를 읽어온다.
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
//		cotent를 출력해준다.
		System.out.println(content);
	}
		
//	,를 넣어주는 메소드를 생성
	public static String insertComma(int number) {
//		temp 문자열에 int로 받은 number를 String으로 바꿔서 넣어준다.
		String temp = String.valueOf(number);
		String result = "";
//		temp의 길이만큼 반복하면서
		for (int i = 0; i < temp.length(); i++) {
//			i가 0이 아니고, i를 3으로 나누었을 때 나머지가 0이면(즉, 세번째 자릿수이면)
			if(i != 0 && i % 3 == 0) {
//				result에 ,를 붙여주고 이어준다.
				result = "," + result;
			}
//			앞에서부터 ,를 채우면 어디까지가 끝인지를 모르니까 temp.length() - 1 - i로 뒤에서부터 가면서 result에 내가 원하는 세번째 자리수마다 ,가 섞여있는 최종 결과 값을 넣어준다.
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}
}