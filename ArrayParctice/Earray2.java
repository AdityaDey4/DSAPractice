package ArrayParctice;

import java.util.*;

public class Earray2 {
	static void findProfit(int[] arr,int n, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int i=0;
		while(i<n)
		{
			int flag=i;
			int j =i+1;
			int sum = 0;
			while(j<n && arr[j]>arr[i])
			{
				flag+=1;
				j+=1;
			}
			sum = arr[flag]-arr[i];
			pq.add(sum);
			i=j;
		}
		int res = 0;
		res = res+pq.element();
		pq.remove();
		res = res+pq.element();
		System.out.print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={10, 22, 5, 75, 65, 80};
		int n = arr.length;
		int k = 2;
		findProfit(arr,n,k);
	}

}
