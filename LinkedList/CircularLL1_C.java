package LinkedList;

public class CircularLL1_C {
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
	void deleteBeginning()
	{
		if(head==null)
		{
			return ;
		}
		Node temp=head;
		int i=1;
		while(i<size)
		{
			temp=temp.next;
			i++;
		}
		head=head.next;
		temp.next=head;
		size--;
	}
	void deleteEnd()
	{
		if(head==null)
		{
			return ;
		}
		Node temp=head;
		int i=1;
		while(i<size-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=head;
		size--;
	}
	void deleteInPosition(int index)
	{
		if(index>size)
		{
			System.out.print("Index is bigger than Size");
			System.out.println();
			return ;
		}
		if(head==null)
		{
			return ;
		}
		Node temp=head;
		int i=1;
		while(i<index-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
		size--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL1_C ll = new CircularLL1_C();
		ll.append(0);
		ll.append(5);
		ll.append(2);
		ll.append(4);
		ll.append(3);
		ll.append(1);
		ll.print();
		ll.deleteBeginning();
		ll.print();
		ll.deleteEnd();
		ll.print();
		ll.deleteInPosition(5);
		ll.print();
	}
}
