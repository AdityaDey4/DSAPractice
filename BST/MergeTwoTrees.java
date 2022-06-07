package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class MergeTwoTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(6);
		root1.left = new Node(2);
		root1.right = new Node(10);
		root1.left.left = new Node(1);
		root1.left.right = new Node(3);
	}

}
