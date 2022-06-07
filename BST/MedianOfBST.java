package BST;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class MedianOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(6);
		root.left = new Node(2);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.left.right.right = new Node(4);
		root.right.left = new Node(8);
		root.right.right = new Node(15);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(9);
		findMedian(root);
	}
	static void findMedian(Node root) {
		int count = totalNode(root);
		int mid = count/2;
		float ans;
		if(count %2 == 0) {
			median(root,mid,mid);
		}
		else {
			median(root,mid,mid+1);
		}
	}
	static void returnMedian(int median, int data1, int data2) {
		if(data1 == data2) {
			System.out.print(median);
		}
		else {
			System.out.print((float)median/2);
		}
	}
	static boolean check(int count, int data1, int data2) {
		if(count == data1 || count == data2) {
			return true;
		}
		else {
			return false;
		}
	}
	static void median(Node root, int data1, int data2) {
		int median = 0;
		int count = -1;
		Node curr = root;
		while(curr != null) {
			if(curr.left == null) {
				count++;
				boolean isSame = check(count,data1,data2);
				if(isSame == true) {
					median+=curr.data;
				}
				curr = curr.right;
			}
			else {
				Node temp = curr.left;
				while(temp.right != null && temp.right != curr) {
					temp = temp.right;
				}
				if(temp.right == null) {
					temp.right = curr;
					curr = curr.left;
				}
				else {
					temp.right = null;
					count++;
					boolean isSame = check(count,data1,data2);
					if(isSame == true) {
						median+=curr.data;
					}
					curr = curr.right;
				}
			}
		}
		returnMedian(median,data1,data2);
	}
	static int totalNode(Node root) {
		if(root == null) {
			return (Integer) null;
		}
		int count =-1;
		Node curr = root;
		while(curr != null) {
			if(curr.left == null) {
				count++;
				curr = curr.right;
			}
			else {
				Node temp = curr.left;
				while(temp.right != null && temp.right != curr) {
					temp = temp.right;
				}
				if(temp.right == null) {
					temp.right = curr;
					curr = curr.left;
				}
				else {
					temp.right = null;
					count++;
					curr = curr.right;
				}
			}
		}
		return count;
	}
}
