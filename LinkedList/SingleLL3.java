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
public class SingleLL3 {
	static Node insertAtBeginning(Node head, int x)
    {
       Node n1 = new Node(x);
       n1.next=head;
       head=n1;
       return head;
    }
	static void insertAtEnd(Node head, int x)
    {
        Node n1 = new Node(x);
        Node h = head;
        while(h.next!=null)
        {
            h=h.next;
        }
        h.next=n1;
        n1.next=null;
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
		head=insertAtBeginning(head,0);
		print(head);
		insertAtEnd(head,4);
		print(head);
	}

}
