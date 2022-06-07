package LinkedList;

public class DoubleLL2 {
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
	void firstDelete()
	{
		Node temp=head;
		head=head.next;
		head.prev=null;
		temp.next=null;
	}
	void lastDelete()
	{
		Node temp=head;
		Node prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		temp.prev=null;
	}
	void deleteInPosition(int pos)
	{
		Node temp=head;
		int i=1;
		while(i<pos)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL2 ll = new DoubleLL2();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.print();
		ll.firstDelete();
		ll.print();
		ll.lastDelete();
		ll.print();
		ll.deleteInPosition(1);
		ll.print();
	}

}
