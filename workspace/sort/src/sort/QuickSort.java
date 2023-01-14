package sort;

import java.util.ArrayList;

class QuickSort{
	int i=0;
	public int partition(ArrayList<Stud> arrl, int begin, int end){
		int pivot, L, R, t;
		L = begin;
		R = end;
		Stud st = new Stud();
		pivot = (begin + end)/2;
		System.out.printf("\n [ÄüÁ¤·Ä %d ´Ü°è : pivot=%d ]\n", ++i, arrl.get(pivot).id);
		while(L<R){
			while((arrl.get(L).id<=arrl.get(pivot).id) && (L<=R)) L++;
			while((arrl.get(R).id>arrl.get(pivot).id)&& (L<=R)) R--;
			if(L<R){
				st = arrl.get(L);
				arrl.set(L, arrl.get(R));
				arrl.set(R, st);
				if(L==pivot) {
					for(t=0; t<arrl.size(); t++)
						System.out.printf("%d %s %s", arrl.get(t).id,arrl.get(t).name, arrl.get(t).addr + "/ ");
					System.out.println();
					return R;
				}
			}
		}
		st=arrl.get(pivot);
		arrl.set(pivot,arrl.get(R));
		arrl.set(R, st);
		for(t=0; t<arrl.size(); t++)
			System.out.printf("%d %s %s", arrl.get(t).id,arrl.get(t).name, arrl.get(t).addr + "/ ");
		System.out.println();
		return R;
	}
	
	public void quickSort(ArrayList<Stud> arrl, int begin, int end){
		if(begin < end){
			int p;
			p = partition(arrl, begin, end);
			quickSort(arrl, begin, p-1);
			quickSort(arrl, p+1, end);
		}
	}
}
