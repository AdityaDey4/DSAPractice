package LinkedList;

import java.util.*;

public class DoubleLL16 {
	Node head;
	class Node
	{
		Node prev;
		int data;
		Node next;
		Node(int data)
		{
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	void append(int x)
	{
		Node n= new Node(x);
		if(head==null)
		{
			n.prev=null;
			head=n;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;
			n.prev=last;
		}
		n.next=null;
	}
	void print()
	{
		Node temp=head;
		System.out.println("In Normal Oreder.........");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void deleteAllOccurence()
	{
		HashSet<Integer> set = new HashSet<>();
		if(head==null)
		{
			return;
		}
		set.add(head.data);
		Node curr=head.next;
		Node temp=head;
		while(curr!=null)
		{
			if(set.contains(curr.data)==false)
			{
				set.add(curr.data);
				temp.next=curr;
				curr.prev=temp;
				temp=temp.next;
			}
			curr=curr.next;
		}
		temp.next=null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL16 ll = new DoubleLL16();
		ll.append(1);
		ll.append(2);
		ll.append(2);
		ll.append(4);
		ll.append(2);
		ll.append(7);
		ll.print();
		ll.deleteAllOccurence();
		ll.print();
	}

}
