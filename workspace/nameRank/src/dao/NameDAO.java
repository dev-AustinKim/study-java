package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import domain.BoyVO;
import domain.GirlVO;
import domain.Name;
import domain.NameDTO;

public class NameDAO {
//	girls��� GirlVO Ÿ���� ArrayList�� �����.
	public ArrayList<GirlVO> girls = new ArrayList<GirlVO>();
	
//	boys��� BoyVO Ÿ���� ArrayList�� �����.	
	public ArrayList<BoyVO> boys = new ArrayList<BoyVO>();
	
//	���� �̸��� ������� �޸��� ��� 1�� �����̸��� ������� �޸��� ��� 2�� �� ���� ��ģ �޸��� ��� 3�� �Ű������� �ް�  
	public void merge(String path1, String path2, String path3) throws IOException {
		
//		DBConnecter�� �ִ� path1, path2���� �о�´�.
		BufferedReader boyReader = DBConnecter.getReader(path1);
		BufferedReader girlReader = DBConnecter.getReader(path2);
		
		BufferedWriter bufferedWriter = null;

//		
		GirlDAO girlDAO = new GirlDAO();
		BoyDAO boyDAO = new BoyDAO();

		String line = null, temp = "";
//		�����̸��� ���� �޸��忡�� ���پ� �о�ͼ� boys�� ����ش�.
		while((line = boyReader.readLine()) != null) {
//			���߿� B�� �ٿ��ֱ� ���ؼ� boys���� ��Ƴ��´�.
			boys.add(boyDAO.setObject(line));
//			���� �̸��� ��ġ�� ���ؼ� ��Ƴ��´�.
			temp += line + "\n";
		}

		boyReader.close();

//		���� �̸��� ���� �޸��忡�� ���پ� �о�ͼ� girls�� ����ش�.
		while((line = girlReader.readLine()) != null) {
//			���߿� G�� �ٿ��ֱ� ���ؼ� girls���� ��Ƴ��´�. 
			girls.add(girlDAO.setObject(line));
//			���� �̸��� ��ġ�� ���ؼ� ��Ƴ��´�.
			temp += line + "\n";
		}

		girlReader.close();

		
//		����� �̸��� ������� �޸����θ� �����Ѵ�.
		bufferedWriter = DBConnecter.getWriter(path3);

//		���� �̸��� ���ĳ��� ��ü �̸��� temp�� path3�� write ���ش�.
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

//	
	public void updateRanking(String path) throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getWriter(path);
//		��ü �̸��� ���� NAME Ÿ���� names ArrayList�� ����� ���´�.
		ArrayList<Name> names = new ArrayList<Name>();
		
		List<Integer> populations = null;
		
		HashSet<Integer> populationSet = null;
		int ranking = 1, count = 0; // ranking�� �α��� ����, count�� �ߺ������� ����� �� ������ ����ϱ� ���ؼ� ����
		String temp = ""; // �ߺ��� ���ŵ� ��ü���� �ձ� ���ؼ� ����

//		names�� girls ArrayList ���θ� names ArrayList�� �����ش�.
		names.addAll(girls);
		
//		names�� boys ArrayList ���θ� names ArrayList�� �����ش�.
		names.addAll(boys);

//		popilationSet�̶�� �̸��� ���� HashSet�� ��ü �̸��� �־��ֱ� ���ؼ� ��ü Name�� ��ü���� ���鼭 �� �α����� �̾ƿͼ� list�������� �ٲ��ش�.
		populationSet = new HashSet(names.stream()
				.map(Name::getPopulation).collect(Collectors.toList()));

//		populations��� �̸��� ���� IntegerŸ���� ArrayList�� �������ָ鼭 �ؽ�Set ������ populationSet�� ����ְ� ������������ list�� ��´�. 
		populations = new ArrayList<Integer>(populationSet).stream()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());

//		populations�� ��ü ���鼭
		for (Integer population : populations) {
			count = 0;
//			��ü �̸��� ��� names�� ���鼭 �̸� ��ü�� ����.
			for (Name nameVO : names) {
//				populations�� ��� �α����� ��ü �̸��� ���鼭 ���� �̸���ü�� �α����� ���ٸ�
				if(population == nameVO.getPopulation()) {
//					���ο� NameDTo ��ü�� ����
					NameDTO nameDTO = new NameDTO();
//					�� ��ü�� ������ ����ִµ� �̸���ü�� Ŭ���� Ÿ���� BoyVO�� �տ� B�� �ٿ��ְ� GirlVO�� G�� �ٿ��ش�.
					nameDTO.setGender(nameVO instanceof BoyVO ? "B" : "G");
//					�� ��ü�� �α����� ���� �̸��� �������ش�.
					nameDTO.setName(nameVO.getName());
//					��ŷ�� ����
					nameDTO.setRanking(ranking);
//					�α����� ����
					nameDTO.setPopulation(nameVO.getPopulation());
//					temp�� nameDTO�� �� ����ش�.
					temp += nameDTO.toString() + "\n";
//					�� if���� ���Դٸ� �ߺ��� ��� ���ϱ� count�� ���ָ鼭 �ߺ��� ������ �� �����ϰ� �� �ڿ� ���� ������ ����� �����ֱ� ���ؼ� count++�� ���ش�.
					count++;
				}
			}
//			if �ߺ��� �α� ���� �ϳ��� �ִٸ�
			if(count > 1) {
				ranking += count; // ���ݱ��� ++�� count�� ranking�� �����ش�.
				continue;
			}
			ranking ++; // �Ϲ������� �ϳ��� �÷��ش�.
		}
		
//		���ݲ� ���� temp�� ���ش�.
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

//	�α����� ,�� �־ �� ,�� �߰����ش�.
	public static String insertComma(int number) {
		
//		String.valueOf�� int Ÿ���� ������ String Ÿ������ �ٲ��ش�. 
		String temp = String.valueOf(number);
		String result = "";

//		�޾ƿ� ����ŭ �ݺ��Ѵ�.
		for (int i = 0; i < temp.length(); i++) {
//			3�ڸ� ������ ,�� ����ֱ� ���ؼ� �̷��� ����
			if(i != 0 && i % 3 == 0) {
				result = "," + result;
			}
//			�տ������� ,�� ���ش�.
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}
}