package Tree;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Level_Order2 {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level_Order2 ob = new Level_Order2();
		ob.root = new Node(1);
		ob.root.left = new Node(2);
		ob.root.right = new Node(3);
		ob.root.left.left = new Node(4);
		ob.root.right.left = new Node(0);
		ob.root.left.left.left = new Node(5);
		print(ob.root);
	}
	static void print(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(! q.isEmpty()) {	
			Node f = q.poll();
			System.out.print(f.data+" ");
			if(f.left != null) {
				q.add(f.left);
			}
			if(f.right != null) {
				q.add(f.right);
			}
		}
	}
}
