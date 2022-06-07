package LinkedList;

public class SingleLL16 {
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
	Node removeDuplicates()
    {
	    Node temp=head;
	    while(temp!=null && temp.next!=null)
	    {
	        Node prev = temp;
	        while(prev!=null && prev.data==temp.data)
	        {
	            prev=prev.next;
	        }
	        temp.next=prev;
	        temp=temp.next;
	    }
	    return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL16 ll = new SingleLL16();
		
		ll.addValue(4);
		ll.addValue(3);
		ll.addValue(2);
		ll.addValue(2);
		ll.addValue(1);
		ll.addValue(1);
		ll.addValue(1);
		ll.print();
		Node curr = ll.removeDuplicates();
		ll.head=curr;
		ll.print();
	}

}
