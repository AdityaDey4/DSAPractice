package ArrayParctice;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Carray19 {
	static int k=4;
	static void checkSize(PriorityQueue p)
	{
		if(p.size()>k)
		{
			p.remove();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5 ,7 ,-9 ,2 ,6};
		int n = a.length;
		Arrays.sort(a);
		int dif =0;
		PriorityQueue <Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				dif=a[j]-a[i];
				pq.add(dif);
				checkSize(pq);
			}
		}
		System.out.print(pq.element());
	}

}
