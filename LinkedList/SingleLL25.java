package LinkedList;

public class SingleLL25 {
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
	void reverse()
	{
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL25 ll = new SingleLL25();
		
		ll.addValue(1);
		ll.addValue(3);
		ll.addValue(2);
		ll.addValue(2);
		ll.addValue(3);
		ll.addValue(4);
		ll.addValue(1);
		ll.print();
		ll.reverse();
		ll.print();
	}

}
