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
public class Iterative_Postorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(9);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(8);
		root.right.left.right = new Node(0);
		iterate(root);
	}
	static void iterate(Node root) {
		Stack<Node> s = new Stack<Node>();
		while(true) {
			while(root != null) {
				s.add(root);
				s.add(root);
				root = root.left;
			}
			if(s.empty() == true) {
				return;
			}
			Node curr = s.pop();
			if(!s.empty() && s.peek() == curr) {
				root = curr.right;
			}
			else {
				System.out.print(curr.data+" ");
				root = null;
			}
		}
	}
}
