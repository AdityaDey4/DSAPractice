package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class BST_orNot {

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
		boolean ans = checkBSTorNot(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.print("Binary Search Tree : "+ans);
	}
	static boolean checkBSTorNot(Node root,int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.data < min || root.data > max) {
			return false;
		}
		return checkBSTorNot(root.left,min,root.data-1) && checkBSTorNot(root.right,root.data+1,max);
	}
}
