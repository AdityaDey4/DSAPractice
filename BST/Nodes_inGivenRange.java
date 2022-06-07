package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Nodes_inGivenRange {

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
		int min = 5;
		int max = 14;
		int node = countNodeInRange(root,min,max);
		System.out.print("Nodes between "+min+" & "+max+" is : "+node);
	}
	static int countNodeInRange(Node root, int min, int max) {
		if(root == null) {
			return 0;
		}
		if(root.data >= min && root.data <= max) {
			return 1+countNodeInRange(root.left,min,max)
					+countNodeInRange(root.right,min,max);
		}
		else if(root.data < min) {
			return countNodeInRange(root.right,min,max);
		}
		else {
			return countNodeInRange(root.left,min,max);
		}
	}
}
