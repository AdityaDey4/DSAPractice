package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class BT_ToDLL {

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
		createDoubleLL(root);
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.right;
		}
	}
	static Node head;
	static Node prev = null;
	static void createDoubleLL(Node root) {
		if(root == null) {
			return ;
		}
		createDoubleLL(root.left);
		if(prev == null) {
			head = root;
		}
		else {
			root.left = prev;
			prev.right = root;
		}
		prev = root;
		createDoubleLL(root.right);
	}
}
