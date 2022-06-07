package LinkedList;

public class CircularLL1 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL1 ll = new CircularLL1();
		ll.append(5);
		ll.append(2);
		ll.append(4);
		ll.append(3);
		ll.append(1);
		ll.print();
	}

}
