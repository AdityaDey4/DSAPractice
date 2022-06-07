package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Postorder_toBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,2,7,9,8,15,10,6};
		Node root = postToBST(arr,arr.length-1);
		print(root);
	}
	static int index;
	static Node postToBST(int[] arr, int lenght) {
		index = lenght;
		return createNode(arr,lenght,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	static Node createNode(int[] arr, int length, int min, int max) {
		if(index < 0) {
			return null;
		}
		Node root = null;
		if(arr[index] > min && arr[index] < max) {
			root = new Node(arr[index--]);
		}
		else {
			return null;
		}
		root.right = createNode(arr,length,root.data,max);
		root.left = createNode(arr,length,min,root.data);
		return root;
	}
	static void print(Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}
}
