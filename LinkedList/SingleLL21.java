package LinkedList;

import java.util.*;

public class SingleLL21 {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	void addValue(int x)
	{
		Node n = new Node(x);
		n.next=head;
		head=n;
	}
	static ArrayList<Integer> intersection(Node n1, Node n2)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		while(n1!=null)
		{
			set.add(n1.data);
			n1=n1.next;
		}
		while(n2!=null)
		{
			if(set.contains(n2.data))
			{
				al.add(n2.data);
			}
			n2=n2.next;
		}
		return al;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL21 ll = new SingleLL21();
		ll.addValue(1);
		ll.addValue(3);
		ll.addValue(2);
		SingleLL21 ll2 = new SingleLL21();
		ll2.addValue(4);
		ll2.addValue(2);
		ll2.addValue(3);
		ArrayList<Integer> al = intersection(ll.head,ll2.head);
		for(int i : al)
		{
			System.out.print(i+" ");
		}
	}

}
