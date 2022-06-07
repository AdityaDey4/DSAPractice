package Tree;
import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int x)
	{
		data=x;
		left=null;
		right=null;
	}
}
public class BT1 {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BT1 tree = new BT1();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.right.left= new Node(4);
		Queue<Integer> al = new LinkedList<Integer>();
		Queue<Integer> al3 = new LinkedList<Integer>();
		al3=al;
		al.add(1);
		al.add(2);
		int b = al.peek();
		System.out.println(b);
		
		System.out.println(al);
		System.out.println(al3);
	}
	/*static void print(Queue<Integer> al) {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		//al2 = al;
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
		
	}*/
	
}
