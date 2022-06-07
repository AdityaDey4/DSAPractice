package ArrayParctice;

import java.util.*;
import java.util.Map.Entry;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,1,2,3,4,1,2};
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
		}
		 PriorityQueue<Map.Entry<Integer,Integer>> queue= new PriorityQueue<>();
		for (Map.Entry<Integer, Integer> entry : m.entrySet())
		{
           queue.offer(entry);
		}
		for(Entry<Integer, Integer> pq : queue)
		{
			System.out.println(queue.poll().getKey());
		}
	}

}
