package BST;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Pair_ofSum {

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
		int sum = 14;
		checkPairs(root,sum);
	}
	static void checkPairs(Node root, int sum) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		addData(root,al);
		int i=0;
		int j=al.size()-1;
		while(i<j) {
			if(al.get(i)+al.get(j)==sum) {
				System.out.println(al.get(i)+" + "+al.get(j)+" = "+sum);
				i++;
				j--;
			}
			else if(al.get(i)+al.get(j) > sum){
				j--;
			}
			else {
				i++;
			}
		}
	}
	static void addData(Node root, ArrayList<Integer> al) {
		if(root == null) {
			return;
		}
		addData(root.left,al);
		al.add(root.data);
		addData(root.right,al);
	}
}
