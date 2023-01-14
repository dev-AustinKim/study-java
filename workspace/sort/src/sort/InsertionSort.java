package sort;


import java.util.ArrayList;

public class InsertionSort {
	public void insertionSort(ArrayList<Stud> arrl, int size){
		int i, j, t; 
		Stud temp = new Stud();
		for(i=1; i<arrl.size(); i++){
			temp = arrl.get(i);
			j = i;
			while((j>0) && (arrl.get(j-1).id>temp.id)){
				arrl.set(j,arrl.get(j-1));
				j--;
			}
			arrl.set(j,temp);
			System.out.printf("\n삽입정렬 %d 단계 : \n", i);
			for(t=0; t<arrl.size(); t++)
				System.out.printf("%d %s %s", arrl.get(t).id,arrl.get(t).name, arrl.get(t).addr + "/ ");
		}
		System.out.println();
	}
}