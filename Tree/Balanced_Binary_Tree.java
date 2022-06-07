package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Balanced_Binary_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		int res = check(root);
		if(res == -1) {
			System.out.print("Not a Balanced Tree");
		}
		else {
			System.out.print("A Balanced Tree");
		}
	}
	static int check(Node root) {
		if(root == null) {
			return 0;
		}
		int left = check(root.left);
		int right = check(root.right);
		if(left > right) {
			return -1;
		}
		return 1+Math.max(left, right);
	}
}
