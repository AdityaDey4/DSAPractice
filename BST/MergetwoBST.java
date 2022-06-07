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
public class MergetwoBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(7);
		root1.left = new Node(2);
		root1.right = new Node(9);
		root1.left.right = new Node(5);
		
		Node root2 = new Node(4);
		root2.left = new Node(3);
		root2.right = new Node(6);
		root2.right.right = new Node(10);
		
		Node root = merging(root1,root2);
		print(root);
	}
	static Node merging(Node root1, Node root2) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		addNode(root1,al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		addNode(root2,al2);
		al2.addAll(al1);
		Collections.sort(al2);
		return createNode(al2,0,al2.size()-1);
	}
	static Node createNode(ArrayList<Integer> al, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start+end)/2;
		Node root = new Node(al.get(mid));
		root.left = createNode(al,start,mid-1);
		root.right = createNode(al,mid+1,end);
		return root;
	}
	static void addNode(Node root, ArrayList<Integer> al) {
		if(root == null) {
			return ;
		}
		addNode(root.left,al);
		al.add(root.data);
		addNode(root.right,al);
	}
	static void print(Node root) {
		if(root == null) {
			return ;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
}
