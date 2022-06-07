package ArrayParctice;

import java.util.*;

public class Carray9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,8 ,6 ,1 ,7 ,2 ,9};
		int k = a.length-2;
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		{
			p.offer(a[i]);
			if(p.size()>k)
			{
				p.poll();
			}
		}
		while(p.size()>0)
		{
			System.out.print(p.peek()+" ");
			p.poll();
		}
	}

}
