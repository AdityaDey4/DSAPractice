package Tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Level_Order1 {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level_Order1 ob = new Level_Order1();
		ob.root = new Node(1);
		ob.root.left = new Node(2);
		ob.root.right = new Node(3);
		ob.root.left.left = new Node(4);
		ob.root.right.left = new Node(0);
		ob.root.left.left.left = new Node(5);
		int height = ob.findHeight(ob.root);
		for(int i=1;i<=height;i++) {
			ob.travers(ob.root,i);
		}
	}
	void travers(Node root, int h) {
		if(h == 0) {
			return ;
		}
		else if(h == 1) {	
			System.out.print(root.data+" ");	
		}
		else if(h>1) {
			try {
				travers(root.left,h-1);
				travers(root.right,h-1);
			}
			catch(Exception e) {}
		}
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
}
