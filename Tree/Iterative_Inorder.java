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
public class Iterative_Inorder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.left.right.left = new Node(6);
		iterate(root);
	}
	static void iterate(Node root) {
		Node curr = root;
		Stack<Node> s = new Stack<Node>();
		s.add(curr);
		while(s.empty() == false) {
			while(curr.left != null) {
				s.add(curr.left);
				curr = curr.left;
			}
			Node pre = s.pop();
			System.out.print(pre.data+" ");
			if(pre.right != null) {
				s.add(pre.right);
				curr = pre.right;
			}
		}
	}
}
