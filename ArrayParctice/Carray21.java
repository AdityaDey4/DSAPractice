package ArrayParctice;

import java.util.*;

public class Carray21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
        int n = arr.length;
        int k = 2;
        HashMap<Integer,Integer> mp = new  HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
        	mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        ArrayList<Map.Entry<Integer, Integer>> l = new ArrayList<Map.Entry<Integer, Integer>>(mp.entrySet());
    	Collections.sort(l,new Comparator<Map.Entry<Integer, Integer>>()
    			{
    				public int compare(Map.Entry<Integer, Integer> n1, Map.Entry<Integer, Integer> n2)
    				{
    					if(n1.getValue()==n2.getValue())
    					{
    						return n2.getKey()-n1.getKey();
    					}
    					else
    					{
    						return n2.getValue()-n1.getValue();
    					}
    				}
    			});
        for(int i=0;i<k;i++)
        {
        	System.out.print(l.get(i).getKey()+" ");
        }
	}
}
