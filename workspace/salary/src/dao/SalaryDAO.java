package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
	//   �߰�
	public void insert(SalaryVO salaryVO) throws IOException{
//		������� ������ �̾�� ���� ����
		BufferedWriter bufferedWriter = DBConnecter.getAppend();
//		content ���ڿ��� DBConnecter�� salary.txt�� ��θ� path�� �޾Ƽ� ���� �־��ش�.
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String temp = null;
//		temp�� 
		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
		temp += salaryVO.toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

	//   ����(�ҵ漼)
	public void update(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

//		line ���ڿ��� DBConnecter���� �о�� ������ �ְ� �� ������ ���� ������ �ݺ�
		while((line = bufferedReader.readLine()) != null) {
//			���� line ���ڿ��� "   "�������� ���� 0��° �濡 �ִ� ���� salaryVO�� Salary�� �ݾ׿� ,�� ���� ���� ���ٸ� 
			if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
//				data ���ڿ��� line���ڿ� 0��° �ε������� line���ڿ� ������ "   "�� ó�� �߰��� �������� ������ ����. 
				String data = line.substring(0, line.lastIndexOf("   "));

//				temp�� data�� 0��° �ε������� data ���ڿ� ������ "   "�� ó�� �߰��� �������� ������ �����ش�.
				temp += data.substring(0, data.lastIndexOf("   ")) + "   " 
//						�ҵ漼�� , ���� ������ �����ش�.
						+ insertComma(salaryVO.getIncomeTax()) + "   "
//						���� �ҵ漼�� , ���� ������ �����ְ� �ٹٲ��� �Ѵ�.
						+ insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
			}
//			if�� �ȿ� ���� �ʾҴٸ� line�� ���� �״�θ� temp�� ���ذ��鼭 �־��ش�.
			temp += line + "\n";
		}
//		bufferedWriter�� ����⸦ �������ְ�
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
//		temp�� �����.
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();
	}
	//   ����
	public void delete(int salary) throws IOException {
		
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";
//		line�� ���پ� �о�� ������ �־��ָ� �װ� null�� �ƴ϶�� �ݺ�
		while((line = bufferedReader.readLine()) != null) {
//			salary�� ,�� �־��� ���� line�� "   " �������� ������ ���߿� 0��° �ε����� ���ٸ� if�� ����
			if((insertComma(salary)+"����").equals(line.split("   ")[0])) {
//				���� �ݺ����� �Ѿ.
				continue;
			}
//			temp�� line(���پ�)�� ��� �����ش�.
			temp += line + "\n";
		}
				
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
//		bufferedWriter�� temp�� ������ش�.
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();
	}
	
	//   ��ȸ
	public SalaryVO find(int salary) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		
		String line = null;
//		salaryVO ��ü�� ����.
		SalaryVO salaryVO = new SalaryVO();
//		line�� ���پ� �о�� ���� �־��ְ� �װ� null�� �ƴϸ�
		while((line = bufferedReader.readLine()) != null) {
//			salary�� ,�� �־��ָ鼭 line�� "   "�������� ���� 0��° ��� ���ٸ� if�� ����
			if((insertComma(salary)+"����").equals(line.split("   ")[0])) {							
//				line���ڿ��� "   "�������� ���� 0��° �濡 "����"�������� ���� 0��° �濡 replaceAll�� ����ؼ� ,�� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� Salary�� �־��ش�.
				salaryVO.setSalary(Integer.parseInt(line.split("   ")[0].split("����")[0].replaceAll(",", "")));
				
//				line���ڿ��� "   "�� �������� ������ �� 1��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� NetPay�� �־��ش�.
				salaryVO.setNetPay(Integer.parseInt(line.split("   ")[1].replaceAll(",", "")));
				
//				line���ڿ��� "   "�� �������� ������ �� 2��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� TaxDeductionAmount�� �־��ش�.				
				salaryVO.setTaxDeductionAmount(Integer.parseInt(line.split("   ")[2].replaceAll(",", "")));
				
//				line���ڿ��� "   "�� �������� ������ �� 3��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� Pension�� �־��ش�.								
				salaryVO.setPension(Integer.parseInt(line.split("   ")[3].replaceAll(",", "")));
				
//				line���ڿ��� "   "�� �������� ������ �� 4��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� HealthInsurance�� �־��ش�.												
				salaryVO.setHealthInsurance(Integer.parseInt(line.split("   ")[4].replaceAll(",", "")));
				
//				line���ڿ��� "   "�� �������� ������ �� 5��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� LongTermCarePay�� �־��ش�.													            
				salaryVO.setLongTermCarePay(Integer.parseInt(line.split("   ")[5].replaceAll(",", "")));
				
//				line���ڿ��� "   "�� �������� ������ �� 6��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� EmploymentInsurance�� �־��ش�.													            	            
				salaryVO.setEmploymentInsurance(Integer.parseInt(line.split("   ")[6].replaceAll(",", "")));

//				line���ڿ��� "   "�� �������� ������ �� 7��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� IncomeTax�� �־��ش�.													            	            
				salaryVO.setIncomeTax(Integer.parseInt(line.split("   ")[7].replaceAll(",", "")));
	            
//				line���ڿ��� "   "�� �������� ������ �� 8��° �濡�� replaceAll�� ����ؼ� , �� ���� �� ���ڿ��� �ٲ��� ���� int�� �ٲ㼭 salaryVO�� LocalTax�� �־��ش�.													            	            
				salaryVO.setLocalTax(Integer.parseInt(line.split("   ")[8].replaceAll(",", "")));			
				
//				salaryVO�� �������ش�.
				return salaryVO;
			}
		}

		bufferedReader.close();
//		�о�� ���� ���ٵ� ���ٸ� �׳� null�� �������ش�.
		return null;
	}
	

	//   ���
	public void list() throws IOException {
//		content ���ڿ��� DBConnecter.PATH(salary.txt) ��ü�� �о�´�.
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
//		cotent�� ������ش�.
		System.out.println(content);
	}
		
//	,�� �־��ִ� �޼ҵ带 ����
	public static String insertComma(int number) {
//		temp ���ڿ��� int�� ���� number�� String���� �ٲ㼭 �־��ش�.
		String temp = String.valueOf(number);
		String result = "";
//		temp�� ���̸�ŭ �ݺ��ϸ鼭
		for (int i = 0; i < temp.length(); i++) {
//			i�� 0�� �ƴϰ�, i�� 3���� �������� �� �������� 0�̸�(��, ����° �ڸ����̸�)
			if(i != 0 && i % 3 == 0) {
//				result�� ,�� �ٿ��ְ� �̾��ش�.
				result = "," + result;
			}
//			�տ������� ,�� ä��� �������� �������� �𸣴ϱ� temp.length() - 1 - i�� �ڿ������� ���鼭 result�� ���� ���ϴ� ����° �ڸ������� ,�� �����ִ� ���� ��� ���� �־��ش�.
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}
}