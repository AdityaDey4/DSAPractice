package LinkedList;

public class DoubleLL3 {
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
	void reverse()
	{
		Node curr=head;
	    Node temp=null;
	    while(curr!=null)
	    {
	        temp=curr.prev;
	        curr.prev=curr.next;
	        curr.next=temp;
	        curr=curr.prev;
	    }
	    if (temp != null) {
            head = temp.prev;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL3 ll = new DoubleLL3();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.print();
		ll.reverse();
		ll.print();
	}

}
