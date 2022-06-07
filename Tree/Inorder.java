package Tree;

public class Inorder {
	int data;
	Inorder left;
	Inorder right;
	Inorder(int key){
		this.data = key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inorder root = new Inorder(1);
		root.left = new Inorder(2);
		root.right = new Inorder(3);
		root.left.left = new Inorder(4);
		root.left.right = new Inorder(5);
		root.left.right.left = new Inorder(6);
		root.right.left = new Inorder(7);
		root.inorder(root);
	}
	 void inorder(Inorder node) {
		if(node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}

}
