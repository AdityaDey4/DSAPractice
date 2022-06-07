package ArrayParctice;

import java.util.*;

public class Darray20 {
	static int solveQuery(int[] a, int n, int f, int l)
	{
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=f;i<=l;i++)
		{
			m.put(a[i], m.getOrDefault(a[i], 0)+1);
		}
		int count =0;
		for(Map.Entry<Integer, Integer> map : m.entrySet())
		{
			if(map.getKey()==map.getValue())
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 2, 3, 3, 3 };
		int n = a.length;
		int [][]q = { { 0, 1 },
					  { 1, 1 },
					  { 0, 2 },
					  { 1, 3 },
                	  { 3, 5 },
                	  { 0, 5 } };
		int le = q.length;
		for(int i=0;i<le;i++)
		{
			int f = q[i][0];
			int l = q[i][1];
			System.out.println("Answer for Query "+(i+1)+" is : "+solveQuery(a,n,f,l));
		}
	}

}
