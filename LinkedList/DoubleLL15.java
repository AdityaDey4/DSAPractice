package LinkedList;

public class DoubleLL15 {
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
	void deleteOccurence(int x)
	{
		Node head1=head;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		while(head1!=null)
		{
			if(head1.data!=x)
			{
				break;
			}
			head1=head1.next;
		}
		if(head1!=null && head1!=head)
		{
			head1.prev=null;
			head=head1;
		}
		Node curr=head.next;
		Node temp=head;
		while(curr!=null)
		{
			if(curr.data!=x)
			{
				temp.next=curr;
				curr.prev=temp;
				temp=curr;
			}
			curr=curr.next;
		}
		if(last.data==x)
		{
			temp.next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL15 ll = new DoubleLL15();
		ll.append(1);
		ll.append(2);
		ll.append(2);
		ll.append(4);
		ll.append(2);
		ll.append(7);
		ll.print();
		ll.deleteOccurence(2);
		ll.print();
	}

}
