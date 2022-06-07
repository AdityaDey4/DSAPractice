package LinkedList;

public class DoubleLL7 {
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
	void swapkthnode( int num, int k)
    {
        if(k>num)
        {
            return ;
        }
        if(k*2-1==num)
        {
            return ;
        }
        Node temp1=head;
        Node temp1_prev=null;
        for(int i=1;i<k;i++)
        {
            temp1_prev=temp1;
            temp1=temp1.next;
        }
        Node temp2=head;
        Node temp2_prev=null;
        for(int i=1;i<num-k+1;i++)
        {
            temp2_prev=temp2;
            temp2=temp2.next;
        }
        if(k==1)
        {
            Node temp1_next=temp1.next;
            temp1.next=null;
            temp2.next=temp1_next;
            temp2_prev.next=temp1;
            head = temp2;
        }
        else
        {
            Node temp1_next=temp1.next;
            Node temp2_next=temp2.next;
            temp1_prev.next=temp2;
            temp2.next=temp1_next;
            temp2_prev.next=temp1;
            temp1.next=temp2_next;
            head = temp1_prev;
        
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL7 ll = new DoubleLL7();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		ll.append(7);
		ll.print();
		ll.swapkthnode(7, 1);
		ll.print();
	}

}
