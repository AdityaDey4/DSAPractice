package ArrayParctice;

import java.util.*;

public class Carray12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {198, 76, 544, 123, 154, 675};
	     int k = 2;
	     int n = arr.length;
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; i++)
		{
            p.add(arr[i]);
            if(p.size()>k)
            {
            	p.remove();
            }
		}
            int ans = 1;
            while(p.size()>0)
            {
                ans = ans*p.element();
                p.remove();
            }
		System.out.print(ans);
	}

}
