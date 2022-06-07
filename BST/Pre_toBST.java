package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Pre_toBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,2,1,5,10,8,7,9,15};
		Node root = preToBST(arr,arr.length-1);
		print(root);
	}
	static int index = 0;
	static Node preToBST(int[] arr, int lenght) {
		return createNode(arr,lenght,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	static Node createNode(int[] arr, int length, int min, int max) {
		if(index > length) {
			return null;
		}
		Node root = null;
		if(arr[index] > min && arr[index] < max) {
			root = new Node(arr[index++]);
		}
		else {
			return null;
		}
		root.left = createNode(arr,length,min,root.data);
		root.right = createNode(arr,length,root.data,max);
		return root;
	}
	static void print(Node root) {
		if(root == null) {
			return ;
		}
		print(root.left);
		print(root.right);
		System.out.print(root.data+" ");
	}
}
