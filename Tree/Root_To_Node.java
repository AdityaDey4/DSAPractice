package Tree;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Root_To_Node {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(8);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		int data = 9;
		printNode(root,data);
	}
	static void printNode(Node root, int data) {
		if(root == null) {
			return ;
		}
		ArrayList<Integer> al = new ArrayList<>();
		checkNode(root,data,al);
		
	}
	static boolean checkNode(Node root, int item, ArrayList<Integer> al) {
		if(root == null) {
			return false;
		}
		else {
			al.add(root.data);
			if(al.get(al.size()-1) == item) {
				for(int i=0;i<al.size();i++) {
					System.out.print(al.get(i)+" ");
				}
				System.exit(1);
			}
		}
		boolean left = checkNode(root.left,item,al);
		boolean right = checkNode(root.right,item,al);
		if(left == false && right == false) {
			al.remove(al.size()-1);
		}
		return false;
	}
}
