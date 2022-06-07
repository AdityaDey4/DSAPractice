package LinkedList;

import java.util.*;

public class SingleLL17 {
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
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void removeDuplicates() 
	
    {
        HashSet<Integer> set = new HashSet<Integer>();
         Node temp=head;
         Node prev=null;
         while(temp!=null)
         {
             int value=temp.data;
             if(set.contains(value))
             {
                 prev.next=temp.next;
             }
             else
             {
                 set.add(value);
                 prev=temp;
             }
             temp=temp.next;
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SingleLL17 ll = new SingleLL17();
			
			ll.addValue(1);
			ll.addValue(3);
			ll.addValue(2);
			ll.addValue(2);
			ll.addValue(3);
			ll.addValue(4);
			ll.addValue(1);
			ll.print();
			ll.removeDuplicates();
			ll.print();
	}

}
