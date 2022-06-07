package LinkedList;

import LinkedList.DoubleLL11.Node;

public class DoubleLL10 {
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
	void pairSum(int x)
	{
		Node first=head;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		boolean found =false;
		while(first!=last && last.prev!=first)
		{
			if(first.data+last.data==x)
			{
				found=true;
				System.out.println(first.data+" , "+last.data);
				first=first.next;
				last=last.prev;
			}
			else
			{
				if(first.data+last.data<x)
				{
					first=first.next;
				}
				else
				{
					last=last.prev;
				}
			}
		}
		if(found==false)
		{
			System.out.print("Not Found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL10 ll = new DoubleLL10();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(6);
		ll.append(7);
		ll.print();
		ll.pairSum(7);
	}

}
