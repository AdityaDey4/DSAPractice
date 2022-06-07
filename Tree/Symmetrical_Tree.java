package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Symmetrical_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.left.left = new Node(5);
		root.left.right = new Node(4);
		root.right = new Node(2);
		root.right.left = new Node(4);
		root.right.right = new Node(3);
		root.right.right.right = new Node(5);
		check(root);
	}
	static void check(Node root) {
		boolean ans = print(root.left,root.right);
		System.out.print("Symmetrical Tree : "+ans);
	}
	static boolean print(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		return root1.data == root2.data 
				&& print(root1.left, root2.right)
				&& print(root1.right, root2.left);
	}
}
