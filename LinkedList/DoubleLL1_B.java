package LinkedList;

public class DoubleLL1_B {
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
		Node last=temp;
		System.out.println("In Normal Oreder.........");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			last=temp;
			temp=temp.next;
		}
		System.out.println();
		System.out.println("In Reverse Oreder.........");
		while(last!=null)
		{
			System.out.print(last.data+" ");
			last=last.prev;
		}
		System.out.println();
	}
	void firstInsert(int x)
	{
		Node temp=head;
		Node n = new Node(x);
		if(temp==null)
		{
			head=n;
		}
		else
		{
			n.prev=null;
			n.next=head;
			head.prev=n;
			head=n;
		}
	}
	void lastInsert(int x)
	{
		Node temp=head;
		Node n= new Node(x);
		if(temp==null)
		{
			head=n;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
	}
	void insertInPosition(int pos, int x)
	{
		Node n = new Node(x);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			int i=1;
			while(i<pos)
			{
				temp=temp.next;
				i++;
			}
			n.next=temp.next;
			temp.next.prev=n;
			n.prev=temp;
			temp.next=n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL1_B ll = new DoubleLL1_B();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.print();
		ll.firstInsert(0);
		ll.print();
		ll.lastInsert(5);
		ll.print();
		ll.insertInPosition(3, 100);
		ll.print();
	}

}
