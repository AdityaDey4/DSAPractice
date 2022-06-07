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
public class Children_Sum_Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(150);
		root.left = new Node(20);
		root.right = new Node(15);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		root.right.left = new Node(15);
		root.right.right = new Node(15);
		setUpProperty(root);
	}
	static void setUpProperty(Node root) {
		setting(root);
		printing(root);
	}
	static void setting(Node root) {
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			return ;
		}
		else if(root.left == null || root.right == null) {
			if(root.left == null) {
				if(root.data < root.right.data) {
					root.data = root.right.data;
				}
			}
			else {
				if(root.data < root.left.data) {
					root.data = root.left.data;
				}
			}
		}
		else {
			if(root.data < root.left.data+root.right.data) {
				root.data = root.left.data+root.right.data;
			}
			else if(root.data > root.left.data+root.right.data) {
				root.left.data = root.data;
				root.right.data = root.data;
			}
		}
		setting(root.left);
		setting(root.right);
		root.data = root.left.data+root.right.data;
	}
	static void printing(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(! q.isEmpty()) {
			Node p = q.poll();
			System.out.print(p.data+" ");
			if(p.left!=null) {
				q.add(p.left);
			}
			if(p.right!=null) {
				q.add(p.right);
			}
		}
	}
}
