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
public class Zig_Zag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		travers(root);
	}
	static void travers(Node root) {
		Stack<Node> q = new Stack<Node>();
		Stack<Node> q2 = new Stack<Node>();
		q.add(root);
		boolean flag=true;
		while(! q.isEmpty()) {
			Node p = q.pop();
			System.out.print(p.data+" ");
			
			if(flag == true) {
				if(p.left != null) {
					q2.add(p.left);
				}
				if(p.right != null) {
					q2.add(p.right);
				}
			}
			else {
				if(p.right != null) {
					q2.add(p.right);
				}
				if(p.left != null) {
					q2.add(p.left);
				}
			}
			if(q.isEmpty()) {
				flag = !flag;
				Stack<Node> q3 = q;
				q = q2;
				q2 = q3;
			}
		}
	}
}
