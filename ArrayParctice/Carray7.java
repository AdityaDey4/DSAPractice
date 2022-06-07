package ArrayParctice;

import java.util.*;

public class Carray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,9 ,6 ,1 ,8};
		int k = 3;
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		{
			p.offer(a[i]);
		}
		System.out.print(p.peek());
	}

}
