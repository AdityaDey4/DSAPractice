package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Delete {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete ob = new Delete();
		ob.insert(6);
		ob.insert(2);
		ob.insert(10);
		ob.insert(3);
		ob.insert(8);
		ob.insert(1);
		ob.insert(7);
		ob.insert(9);
		ob.insert(4);
		ob.insert(15);
		ob.insert(12);
		ob.insert(16);
		ob.printData(ob.root);
		System.out.println();
		ob.delete(6);
		ob.printData(ob.root);
		System.out.println();
	}
	static Node prev = null;
	void delete(int data) {
		Node target = getTargetNode(root,data);
		Node left = target.left;
		Node right = target.right;
		//System.out.print(left.data+" "+right.data);
		if(prev != null) {
			if(target.data > prev.data) {
				prev.right = left;
			}
			else {
				prev.left = left;
			}
		}
		else {
			root = left;
		}
		while(left.right != null) {
			left = left.right;
		}
		left.right = right;
	}
	Node getTargetNode(Node root, int data) {
		if(root.data == data) {
			return root;
		}
		prev = root;
		if(root.data < data) {
			return getTargetNode(root.right,data);
		}
		else {
			return getTargetNode(root.left,data);
		}
	}
	void insert(int data) {
		root = createNodes(root,data);
	}
	Node createNodes(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		else {
			if(root.data > data) {
				root.left = createNodes(root.left,data);
			}else {
				root.right = createNodes(root.right,data);
			}
			return root;
		}
	}
	void printData(Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+" ");
		printData(root.left);
		printData(root.right);
	}
}
