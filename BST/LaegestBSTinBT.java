package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
class AllData{
		int min;
		int max;
		boolean res;
		int ans;
		AllData(boolean res, int ans, int min, int max){
			this.ans = ans;
			this.max = max;
			this.min = min;
			this.res = res;
		}
}
public class LaegestBSTinBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(6);
		root.left = new Node(8);
		root.right = new Node(10);
		root.left.left = new Node(17);
		root.left.right = new Node(15);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(12);
		root.right.left = new Node(5);
		root.right.right = new Node(15);
		root.right.left.left = new Node(2);
		root.right.left.right = new Node(7);
		root.right.right.right = new Node(18);
		AllData ob = maximumBST(root);
		System.out.println(ob.ans);
	}
	static AllData maximumBST(Node root) {
		if(root == null) {
			return new AllData(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		if(root.left == null && root.right == null) {
			return new AllData(true, 1, root.data, root.data);
		}
		AllData left = maximumBST(root.left);
		AllData right = maximumBST(root.right);
		if(left.res == true && right.res == true) {
			if(root.data > left.max && root.data <right.min) {		
				int x = left.min;
				int y = right.max;
				if(x == Integer.MAX_VALUE) {
					x=root.data;
				}
				if(y == Integer.MIN_VALUE) {
					y=root.data;
				}
				return new AllData(true,1+left.ans+right.ans,x,y);
			}
		}
		return new AllData(false, Math.max(left.ans, right.ans), 0, 0);
	}
}
