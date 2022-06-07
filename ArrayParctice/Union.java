package ArrayParctice;
import java.util.*;
public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 2, 3, 4, 5};
		int[] a2 = { 4, 5, 6, 7, 8};
		HashSet h = new HashSet();
		for(int i=0;i<a1.length;i++)
		{
			h.add(a1[i]);
		}
		for(int j=0;j<a2.length;j++)
		{
			h.add(a2[j]);
		}
		Iterator it = h.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
