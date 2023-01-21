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
//	girls라는 GirlVO 타입의 ArrayList를 만든다.
	public ArrayList<GirlVO> girls = new ArrayList<GirlVO>();
	
//	boys라는 BoyVO 타입의 ArrayList를 만든다.	
	public ArrayList<BoyVO> boys = new ArrayList<BoyVO>();
	
//	남자 이름을 적어놓은 메모장 경로 1과 여자이름을 적어놓은 메모장 경로 2와 그 둘을 합친 메모장 경로 3을 매개변수로 받고  
	public void merge(String path1, String path2, String path3) throws IOException {
		
//		DBConnecter에 있는 path1, path2에서 읽어온다.
		BufferedReader boyReader = DBConnecter.getReader(path1);
		BufferedReader girlReader = DBConnecter.getReader(path2);
		
		BufferedWriter bufferedWriter = null;

//		
		GirlDAO girlDAO = new GirlDAO();
		BoyDAO boyDAO = new BoyDAO();

		String line = null, temp = "";
//		남자이름을 가진 메모장에서 한줄씩 읽어와서 boys에 담아준다.
		while((line = boyReader.readLine()) != null) {
//			나중에 B를 붙여주기 위해서 boys에도 담아놓는다.
			boys.add(boyDAO.setObject(line));
//			남녀 이름을 합치기 위해서 담아놓는다.
			temp += line + "\n";
		}

		boyReader.close();

//		여자 이름을 가진 메모장에서 한줄씩 읽어와서 girls에 담아준다.
		while((line = girlReader.readLine()) != null) {
//			나중에 G를 붙여주기 위해서 girls에도 담아놓는다. 
			girls.add(girlDAO.setObject(line));
//			남녀 이름을 합치기 위해서 담아놓는다.
			temp += line + "\n";
		}

		girlReader.close();

		
//		모두의 이름을 적어놓을 메모장경로를 지정한다.
		bufferedWriter = DBConnecter.getWriter(path3);

//		남녀 이름을 합쳐놓은 전체 이름인 temp를 path3에 write 해준다.
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

//	
	public void updateRanking(String path) throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getWriter(path);
//		전체 이름을 담을 NAME 타입의 names ArrayList를 만들어 놓는다.
		ArrayList<Name> names = new ArrayList<Name>();
		
		List<Integer> populations = null;
		
		HashSet<Integer> populationSet = null;
		int ranking = 1, count = 0; // ranking은 인구수 순위, count는 중복다음에 제대로 된 순위를 출력하기 위해서 선언
		String temp = ""; // 중복이 제거된 객체들을 잇기 위해서 선언

//		names에 girls ArrayList 전부를 names ArrayList에 합쳐준다.
		names.addAll(girls);
		
//		names에 boys ArrayList 전부를 names ArrayList에 합쳐준다.
		names.addAll(boys);

//		popilationSet이라는 이름을 가진 HashSet에 전체 이름을 넣어주기 위해서 전체 Name의 객체들을 돌면서 그 인구수를 뽑아와서 list형식으로 바꿔준다.
		populationSet = new HashSet(names.stream()
				.map(Name::getPopulation).collect(Collectors.toList()));

//		populations라는 이름을 가진 Integer타입의 ArrayList를 선언해주면서 해쉬Set 형식의 populationSet을 담아주고 내림차순으로 list에 담는다. 
		populations = new ArrayList<Integer>(populationSet).stream()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());

//		populations를 전체 돌면서
		for (Integer population : populations) {
			count = 0;
//			전체 이름이 담긴 names를 돌면서 이름 객체를 본다.
			for (Name nameVO : names) {
//				populations에 담긴 인구수와 전체 이름을 돌면서 얻은 이름객체의 인구수가 같다면
				if(population == nameVO.getPopulation()) {
//					새로운 NameDTo 객체를 생성
					NameDTO nameDTO = new NameDTO();
//					그 객체에 성별을 담아주는데 이름객체의 클래스 타입이 BoyVO면 앞에 B를 붙여주고 GirlVO면 G를 붙여준다.
					nameDTO.setGender(nameVO instanceof BoyVO ? "B" : "G");
//					그 객체에 인구수가 같은 이름을 설정해준다.
					nameDTO.setName(nameVO.getName());
//					랭킹을 설정
					nameDTO.setRanking(ranking);
//					인구수를 설정
					nameDTO.setPopulation(nameVO.getPopulation());
//					temp에 nameDTO를 다 담아준다.
					temp += nameDTO.toString() + "\n";
//					이 if문을 들어왔다면 중복인 사람 수니까 count를 세주면서 중복된 순위를 다 제거하고 그 뒤에 오는 순위를 제대로 맞춰주기 위해서 count++을 해준다.
					count++;
				}
			}
//			if 중복된 인구 수가 하나라도 있다면
			if(count > 1) {
				ranking += count; // 지금까지 ++한 count를 ranking에 더해준다.
				continue;
			}
			ranking ++; // 일반적으로 하나씩 올려준다.
		}
		
//		지금껏 담은 temp를 써준다.
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

//	인구수에 ,가 있어서 그 ,를 추가해준다.
	public static String insertComma(int number) {
		
//		String.valueOf가 int 타입의 변수를 String 타입으로 바꿔준다. 
		String temp = String.valueOf(number);
		String result = "";

//		받아온 수만큼 반복한다.
		for (int i = 0; i < temp.length(); i++) {
//			3자리 수마다 ,를 찍어주기 위해서 이렇게 설정
			if(i != 0 && i % 3 == 0) {
				result = "," + result;
			}
//			앞에서부터 ,를 써준다.
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}
}