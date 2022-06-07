package ArrayParctice;

import java.util.*;

public class Carray1_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,8 ,6 ,1};
		int k = 2;
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		{
			p.offer(a[i]);
			if(p.size()>k)
			{
				p.poll();
			}
		}
		System.out.println(p.peek());
	}
}
