package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Insert {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert ob = new Insert();
		ob.insert(6);
		ob.insert(2);
		ob.insert(10);
		ob.insert(3);
		ob.insert(8);
		ob.insert(1);
		ob.insert(7);
		ob.insert(9);
		ob.insert(4);
		ob.insert(11);
		ob.print(ob.root);
	}
	void insert(int data) {
		root = createNode(root,data);
	}
	Node createNode(Node root,int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		else {
			if(root.data>data) {
				root.left = createNode(root.left,data);
			}
			else {
				root.right = createNode(root.right,data);
			}
			return root;
		}
	}
	void print(Node root) {
		if(root == null) {
			return;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
}
