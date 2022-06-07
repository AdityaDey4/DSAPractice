package ArrayParctice;

import java.util.*;

public class Darray23 {
	static int answer(int[]a, int n, int f, int l, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=f-1;i<l;i++)
		{
			pq.add(a[i]);
			if(pq.size()>k)
			{
				pq.remove();
			}
		}
		return pq.element();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 2, 5, 1, 8, 9};
	    int n = a.length;
        int f, l, k;
        f = 2;
        l = 5;
        k=2;
        System.out.println(answer(a, n, f, l,k));
        f = 1;
        l = 6;
        k=4;
        System.out.println(answer(a, n, f, l,k));
	}
}
