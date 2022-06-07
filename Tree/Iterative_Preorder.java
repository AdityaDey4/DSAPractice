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
public class Iterative_Preorder {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterative_Preorder ob = new Iterative_Preorder();
		ob.root = new Node(1);
		ob.root.left = new Node(2);
		ob.root.right = new Node(3);
		ob.root.left.right = new Node(4);
		ob.root.right.left = new Node(5);
		ob.root.left.right.left = new Node(6);
		iterate(ob.root);
	}
	static void iterate(Node root) {
		Stack<Node> q = new Stack<Node>();
		if(root == null) {
			return ;
		}
		q.push(root);
		while(! q.isEmpty()) {
			Node curr = q.pop();
			System.out.print(curr.data+" ");
			if(curr.right != null) {
				q.push(curr.right);
			}
			if(curr.left != null) {
				q.push(curr.left);
			}
		}
	}
}
