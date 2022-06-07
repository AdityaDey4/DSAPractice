package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
class Result{
	public int res=0;
}
public class Diameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(0);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(4);
		root.right.left.left.left = new Node(7);
		root.right.left.left.left.left = new Node(8);
		root.right.right.right = new Node(9);
		root.right.right.right.right = new Node(10);
		root.right.right.right.right.right = new Node(11);
		Result r = new Result();
		findDiameter(root,r);
		System.out.print(r.res);
	}
	static int findDiameter(Node root, Result r) {
		if(root == null) {
			return 0;
		}
		int left = findDiameter(root.left,r);
		int right = findDiameter(root.right,r);
		r.res = Math.max(r.res,(left+right));
		return 1+Math.max(left, right);
	}
}
