package LinkedList;

public class DoubleLL11 {
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
	void insert(int x)
	{
		Node n = new Node(x);
		if(head==null)
		{
			head=n;
		}
		else if(head.data>=n.data)
		{
			n.next=head;
			head.prev=n;
			head=n;
		}
		else
		{
			Node curr = head.next;
			Node prev=null;
			while(curr!=null && curr.data<n.data)
			{
				prev=curr;
				curr=curr.next;
			}
			if(curr==null)
			{
				prev.next=n;
				n.prev=prev;
			}
			else
			{
				prev.next=n;
				n.prev=prev;
				n.next=curr;
				curr.prev=n;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL11 ll = new DoubleLL11();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(6);
		ll.append(7);
		ll.print();
		ll.insert(5);
		ll.print();
	}

}
