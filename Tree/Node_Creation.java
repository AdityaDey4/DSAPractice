package Tree;

public class Node_Creation {
	int data;
	Node_Creation left;
	Node_Creation right;
	Node_Creation(int key){
		this.data = key;
		this.left = null;
		this.right = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node_Creation root = new Node_Creation(10);
		root.left = new Node_Creation(20);
		root.right = new Node_Creation(30);
		root.left.left = new Node_Creation(40);
		root.left.right = new Node_Creation(50);
		root.left.right.left = new Node_Creation(60);
		root.right.left = new Node_Creation(70);
		preOrder(root);
	}
	static void preOrder(Node_Creation node) {
		if(node==null)
		{
			return;
		}
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}

}
