package LinkedList;
public class SingleLL10 {
	static Node head;
	static int len=0;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static void addValue(int x)
	{
		Node n = new Node(x);
		n.next=head;
		head=n;
		len++;
	}
	static void print(int index)
	{
		Node temp = head;
		for(int i=0;i<=len-index;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head=new Node(0);
		addValue(1);
		addValue(2);
		addValue(3);
		addValue(4);
		print(3);
	}

}
