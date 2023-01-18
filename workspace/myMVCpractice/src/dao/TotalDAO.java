package dao;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

import domain.NameVO;

public class TotalDAO {

	public void writeTxt() throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		String temp = overlap().toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

	public ArrayList<NameVO> merge() throws FileNotFoundException, IOException {
		ArrayList<NameVO> results = new ArrayList<>();
		BoysDAO boy = new BoysDAO();
		GirlsDAO girl = new GirlsDAO();
		results.addAll(boy.setObject());
		results.addAll(girl.setObject());

		return results;
	}

	public ArrayList<NameVO> overlap() throws FileNotFoundException, IOException {
		ArrayList<NameVO> temp = rankingUpdate();
		for (int i = 0; i < temp.size(); i++) {
			try {
				temp.get(i).setRemoveAmount("" + sort().get(i));
			} catch (IndexOutOfBoundsException e) {
				temp.get(i).setRemoveAmount("");
			}
		}
		return temp;
	}

	public ArrayList<Integer> removeOverlap() throws FileNotFoundException, IOException {

		ArrayList<Integer> amounts = new ArrayList<Integer>();

		merge().stream().map(NameVO::getNameNumber).forEach(amounts::add);

		HashSet<Integer> amountSet = new HashSet<Integer>(amounts);

		amounts = new ArrayList<Integer>(amountSet);

		return amounts;
	}
	/*
	 * sort merge()
	 * 
	 */

	public ArrayList<Integer> sort() throws FileNotFoundException, IOException {
		ArrayList<Integer> temp = (ArrayList<Integer>) removeOverlap().stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		return temp;
	}

	public ArrayList<NameVO> readyForRemove() throws FileNotFoundException, IOException {

		ArrayList<NameVO> results = new ArrayList<NameVO>();
		ArrayList<Integer> temp = sort();

		for (int i = 0; i < temp.size(); i++) {
			for (int j = 0; j < merge().size(); j++) {
//				merge().get(j)가 이미 포함되어 있으면 ""
				if (merge().get(j).getNameNumber() == temp.get(i)) {
					results.add(merge().get(j));
				}

			}
		}

//		System.out.println(results);
		return results;

	}

	public ArrayList<NameVO> rankingUpdate() throws FileNotFoundException, IOException {
		ArrayList<NameVO> temp = readyForRemove();
		int flag = 0;
		int index = 0;
		int data = 0;
		for (int i = 0; i < temp.size(); i++) {
			if (data == temp.get(i).getNameNumber()) {
				temp.get(i).setRanking(index);
				flag++;
			} else {
				index++;
				index += flag;
				temp.get(i).setRanking(index);
				flag = 0;
			}
			data = temp.get(i).getNameNumber();
		}

//		System.out.println(temp);
		return temp;
	}

}
