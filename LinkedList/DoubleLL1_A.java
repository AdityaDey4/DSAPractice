package LinkedList;

public class DoubleLL1_A {
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL1_A ll = new DoubleLL1_A();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.print();
	}

}
