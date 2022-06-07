package LinkedList;

public class CircularLL1_B {
	Node head;
	int size=0;
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
	void append(int x)
	{
		Node n = new Node(x);
		if(head==null)
		{
			head=n;
			head.next=head;
			size++;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.next=head;
			size++;
		}
	}
	void print()
	{
		Node temp=head;
		for(int i=1;i<=size;i++)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void insertBeginning(int x)
	{
		Node n = new Node(x);
		if(head==null)
		{
			head=n;
			n.next=head;
		}
		Node temp=head;
		int i=1;
		while(i<size)
		{
			temp=temp.next;
			i++;
		}
		n.next=head;
		temp.next=n;
		head=n;
		size++;
	}
	void insertEnd(int x)
	{
		Node n = new Node(x);
		if(head==null)
		{
			head=n;
			n.next=head;
		}
		Node temp=head;
		int i=1;
		while(i<size)
		{
			temp=temp.next;
			i++;
		}
		temp.next=n;
		n.next=head;
		size++;
	}
	void insetInPosition(int index ,int x)
	{
		Node n = new Node(x);
		Node temp=head;
		int i=1;
		while(i<index-1)
		{
			temp=temp.next;
			i++;
		}
		Node next=temp.next;
		temp.next=n;
		n.next=next;
		size++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL1_B ll = new CircularLL1_B();
		ll.append(5);
		ll.append(2);
		ll.append(4);
		ll.append(3);
		ll.append(1);
		ll.print();
		ll.insertBeginning(0);
		ll.print();
		ll.insertEnd(6);
		ll.print();
		ll.insetInPosition(4, 10);
		ll.print();
	}
}
