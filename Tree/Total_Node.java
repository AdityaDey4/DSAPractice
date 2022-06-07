package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Total_Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(8);
		root.right.right.left = new Node(9);
		int ans = totalNode(root);
		System.out.print("Total Node : " + ans);
	}
	static int totalNode(Node root) {
		if(root == null) {return 0;}
		return 1+totalNode(root.left)+totalNode(root.right); 
	}
	
}
