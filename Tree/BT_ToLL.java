package Tree;
import java.util.*;

import com.sun.tools.classfile.StackMapTable_attribute.same_frame;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
} class BT_ToLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(8);
		root.right.right.left = new Node(9);
		createLinkedList(root);
		printLL(root);
	}
	static void createLinkedList(Node root) {
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		while(! s.isEmpty()) {
			Node curr = s.pop();
			if(curr.right != null) {
				s.add(curr.right);
			}
			if(curr.left != null) {
				s.add(curr.left);
			}
			if(! s.isEmpty()) {
				curr.right = s.peek();
			}
			curr.left = null;
		}
	}
	static void printLL(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
		}
		else {
			return ;
		}
		printLL(root.right);
	}
}
