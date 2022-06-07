package LinkedList;
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
public class SingleLL5 {
	static void deleteNodePosition(Node head, int x)
    {
		Node temp=head,prev=null;
	    
	    for(int i=0;i<x;i++)
	    {
	        prev=temp;
	        temp=temp.next;
	    }
	    prev.next=temp.next;

    }
	static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		first.next=n1;
		n1.next=n2;
		Node head = first;
		print(head);
		deleteNodePosition(head,1);
		print(head);
	}

}
