package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class LowestCommonAncestor {

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
		int data1 = 1;
		int data2 = 8;
		Node ancestor = lCA(root,data1,data2);
		System.out.print("Lowest Common Ancestor : "+ancestor.data);
	}
	static Node lCA(Node root, int data1, int data2) {
		if(root == null) {
			return null;
		}
		if(root.data > data1 && root.data > data2) {
			return lCA(root.left,data1,data2);
		}
		if(root.data < data1 && root.data < data2){
			return lCA(root.right,data1,data2);
		}
		return root;
	}
}
