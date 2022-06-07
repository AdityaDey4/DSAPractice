package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class DeadEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(6);
		root.left = new Node(5);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.right.left = new Node(8);
		root.right.right = new Node(15);
		boolean ans = deadEndOrNot(root);
		System.out.print(ans);
	}
	static boolean deadEndOrNot(Node root) {
		if(root == null) {
			return false;
		}
		return isDeadEnd(root,0,Integer.MAX_VALUE);
	}
	static boolean isDeadEnd(Node root, int min, int max) {
		if(root == null) {
			return false;
		}
		if(root.left == null && root.right == null) {
			if(root.data-1 == min || root.data+1 == max) {
				return true;
			}
		}
		boolean left = isDeadEnd(root.left,min,root.data);
		boolean right = isDeadEnd(root.right,root.data,max);
		if(left == true || right == true) {
			return true;
		}
		return false;
	}
}
