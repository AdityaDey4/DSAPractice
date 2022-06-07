package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class CeilValue {

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
		searchCeil(root,11);
		if(ans == Integer.MAX_VALUE) {
			System.out.print("Ceil : -1");
		}
		else {
			System.out.print("Ceil : "+ans);
		}
	}
	static int ans = Integer.MAX_VALUE;
	static void searchCeil(Node root, int data) {
		if(root == null) {
			return ;
		}
		if(root.data>=data) {
			ans = Math.min(ans, root.data);
		}
		searchCeil(root.left,data);
		searchCeil(root.right,data);
	}
}
