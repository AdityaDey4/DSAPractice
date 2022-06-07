package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Hieght {
	Node root ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hieght ob = new Hieght();
		ob.root = new Node(1);
		ob.root.left = new Node(2);
		ob.root.right = new Node(3);
		ob.root.left.left = new Node(4);
		ob.root.left.left.left = new Node(5);
		System.out.println(ob.findHeight(ob.root));
		System.out.print((int) Math.pow(2, 3));
	}
	int findHeight(Node root) {
		if(root == null) {
			return 0;
		}
		int left = findHeight(root.left);
		int right = findHeight(root.right);
		 if(left>right) {
			 return left+1;
		 }
		 else {
			 return right+1;
		 }
	}
	int leftHeight(Node root) {
		if(root == null) {
			return 0;
		}
		return 1+leftHeight(root.left);
	}

}
