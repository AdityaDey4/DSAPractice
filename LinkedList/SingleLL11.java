package LinkedList;

public class SingleLL11 {
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
	int findMiddle()
	{
		Node temp=head;
        Node prev = head;
        while(temp!=null && temp.next!=null)
        {
            temp=temp.next.next;
            prev = prev.next;
        }
        return prev.data;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL11 ll = new SingleLL11();
		for(int i=6;i>0;i--)
		{
			ll.addValue(i);
		}
		ll.print();
		int ans=ll.findMiddle();
		System.out.println(ans);
	}
}
