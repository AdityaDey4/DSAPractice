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
public class BT_to_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(6);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.left.right.right = new Node(15);
		root.right.left = new Node(9);
		root.right.right = new Node(1);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(2);
		createBST(root);
	}
	static void createBST(Node root) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		addData(root,al);
		Collections.sort(al);
		Node root = createNode(al,0,al.size()-1);
		print(root);
	}
	static Node createNode(ArrayList<Integer>  arr, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid = (start+end)/2;
		//System.out.println(mid);
		Node root = new Node(al.get(mid));
		root.left = createNode(arr,start,mid-1);
		root.right = createNode(arr,mid+1,end);
		return root;
	}
	static void print(Node root) {
		if(root == null) {
			return ;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	static void addData(Node root, ArrayList<Integer> al) {
		if(root == null) {
			return;
		}
		al.add(root.data);
		addData(root.left,al);
		addData(root.right,al);
	}
}
