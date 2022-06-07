package LinkedList;

import java.util.*;

public class SingleLL15 {
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
	boolean isPalindrome() 
    {
        Node temp=head;
        Stack<Integer> s = new Stack<Integer>();
        while(temp!=null)
        {
            s.push(temp.data);
            temp=temp.next;
        }
        int flag=0;
        while(head!=null)
        {
            int a = s.pop();
            if(a!=head.data)
            {
                flag=1;
                break;
            }
            head=head.next;
        }
        if(flag==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLL15 ll = new SingleLL15();
		
		ll.addValue(1);
		ll.addValue(2);
		ll.addValue(1);
		ll.print();
		boolean b=ll.isPalindrome();
		if(b==true)
		{
			System.out.println("Palingrome LinkedList.");
		}
		else
		{
			System.out.println("Not a Palingrome LinkedList.");
		}
	}

}
