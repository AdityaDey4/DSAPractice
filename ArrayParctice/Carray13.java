package ArrayParctice;

import java.util.*;

public class Carray13 {
	static int k=7;
	static void checkSize(PriorityQueue p)
	{
		if(p.size()>k)
		{
			p.remove();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 7, 9, 2};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int n = arr.length;
		int total =0;
		for(int i=0;i<n;i++)
		{
			total+=arr[i];
			pq.add(arr[i]);
			checkSize(pq);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int sum = arr[i]+arr[j];
				pq.add(sum);
				checkSize(pq);
			}
		}
		pq.add(total);
		checkSize(pq);
		System.out.print(k+"th largest element is : "+pq.peek());
	}
}
