package ArrayParctice;

import java.util.*;

public class Carray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,9 ,6 ,1 ,8};
		int k = 3;
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
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
