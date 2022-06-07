package Tree;

import java.util.Stack;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Boundary_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.left.right = new Node(4);
		root.left.left.right.left = new Node(5);
		root.left.left.right.right = new Node(6);
		root.right = new Node(7);
		root.right.left = new Node(8);
		root.right.right = new Node(9);
		root.right.right.left = new Node(10);
		root.right.right.left.left = new Node(11);
		root.right.right.left.right = new Node(12);
		boundary_print(root);
	}
	static void boundary_print(Node root) {
		Stack<Node> s = new Stack<Node>();
		s.add(null);
		print_left(root);
		print_leaf(root);
		print_right(root.right,s);
		while(s.peek() != null) {
			System.out.print(s.pop().data+" ");
		}
	}
	static void print_left(Node root) {
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null ) {
			return;
		}
		System.out.print(root.data+" ");
		if(root.left != null) {
			print_left(root.left);
		}
		else {
			print_left(root.right);
		}
	}
	static void print_leaf(Node root) {
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			System.out.print(root.data+" ");
		}
		print_leaf(root.left);
		print_leaf(root.right);
	}
	static void print_right(Node root,Stack<Node> s) {
		if(root == null) {
			return ;
		}
		if(root.left == null && root.right == null) {
			return ;
		}
		s.add(root);
		if(root.right != null) {
			print_right(root.right,s);
		}
		else {
			print_right(root.left,s);
		}
	}
}
