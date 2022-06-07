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
public class SingleLL1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		first.next=n1;
		n1.next=n2;
		Node head = first;
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
