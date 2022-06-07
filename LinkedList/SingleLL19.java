package LinkedList;

public class SingleLL19 {
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
	void pairwiseSwap()
    {
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL19 ll = new SingleLL19();
		
		ll.addValue(1);
		ll.addValue(3);
		ll.addValue(2);
		ll.addValue(2);
		ll.addValue(3);
		ll.addValue(4);
		ll.addValue(1);
		ll.print();
		ll.pairwiseSwap();
		ll.print();
	}

}
