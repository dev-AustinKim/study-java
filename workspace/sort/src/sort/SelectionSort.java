package sort;

import java.util.ArrayList;

class Stud {
	int id;
	String name;
	String addr;

}
class SelectionSort{
	public void selectionSort(ArrayList<Stud> arrl){
		int i, j, min;
		Stud temp = new Stud();
		for(i=0; i<arrl.size()-1; i++){
			min = i;
			for(j=i+1; j<arrl.size(); j++){
				if(arrl.get(min).id > arrl.get(j).id)
					min=j;
			}
			temp = arrl.get(min);
			arrl.set(min, arrl.get(i));
			arrl.set(i, temp);
			System.out.printf("\n선택 정렬 %d 단계 : \n" , i+1);
			for(j=0; j<arrl.size(); j++)
				System.out.printf("%d %s %s", arrl.get(j).id,arrl.get(j).name, arrl.get(j).addr + "/ ");
		}
	}
}