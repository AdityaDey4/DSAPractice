package BST;
//  checking Balanced Tree or Not
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class BalancedTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,6,7,9};
		Node root = createNode(arr,0,arr.length-1);
		//System.out.print(root.right.left.data);
		print(root);
	}
	static Node createNode(int[] arr, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid = (start+end)/2;
		//System.out.println(mid);
		Node root = new Node(arr[mid]);
		root.left = createNode(arr,start,mid-1);
		root.right = createNode(arr,mid+1,end);
		return root;
	}
	static void print(Node root) {
		if(root == null) {
			return ;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
}
