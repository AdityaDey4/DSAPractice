package Tree;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Identical_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(5);
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(5);
		
		System.out.print("Identical Tree : "+checkIdentical(root1,root2));
	}
	static boolean checkIdentical(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		return root1.data == root2.data && checkIdentical(root1.left, root2.left)
				&& checkIdentical(root1.right, root2.right);
	}
}
