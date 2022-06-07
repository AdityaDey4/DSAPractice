package ArrayParctice;

import java.util.HashMap;
import java.util.Map;

public class Darray21 {
	static int bigOccurence(int[] a, int n, int f, int l)
	{
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=f;i<=l;i++)
		{
			m.put(a[i], m.getOrDefault(a[i], 0)+1);
		}
		int count ;
		int res =0;
		for(Map.Entry<Integer, Integer> map : m.entrySet())
		{
			count = map.getValue();
			res = Math.max(count, res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-5, -5, 2, 2, 2, 2, 3, 7, 7, 7};
		int n = a.length;
		int f=0,l=9;
		System.out.println("Maximum Occurrence in range "+f+l+" is : "+bigOccurence(a,n,f,l));
		f=4;
		l=9;
		System.out.println("Maximum Occurrence in range "+f+l+" is : "+bigOccurence(a,n,f,l));
	}

}
