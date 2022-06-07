package BST;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class K_Largest_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(6);
		root.left = new Node(2);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.left.right.right = new Node(4);
		root.right.left = new Node(8);
		root.right.right = new Node(15);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(9);
		root.right.right.left = new Node(12);
		root.right.right.right = new Node(16);
		ArrayList<Node> al = new ArrayList<Node>();
		travers(root,al);
		int small = 4;
		int large = 5;
		System.out.println(small+" smallest element is : "+(al.get(small-1)).data);
		System.out.println(large+" largest element is : "+(al.get(al.size()-large)).data);
	}
	static void travers(Node root, ArrayList<Node> al) {
		if(root == null) {
			return;
		}
		travers(root.left,al);
		al.add(root);
		travers(root.right,al);
	}

}
