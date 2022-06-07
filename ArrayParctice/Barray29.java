package ArrayParctice;

import java.util.*;

public class Barray29 {
	static int ans = 0;
	static void rotrate(int[] arr, int l)
	{
		int sum=0,length;
		int start=0,end=0;
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		m.put(0, -1);
		for(int i=0;i<l;i++)
		{
			if(arr[i]==0)
			{
				sum+=-1;
			}
			else if(arr[i]==1)
			{
				sum+=1;
			}
			if(m.containsKey(sum))
			{
				int index=m.get(sum);
				length= i-index;
				if(ans<length)
				{
					ans=length;
					start = index+1;
					end = i;
				}
			}
			else
			{
				m.put(sum, i);
			}
		}
		System.out.print("Start : "+start+" End : "+end+" Length : "+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,0,1,1,0};
		rotrate(arr,arr.length);
	}

}
