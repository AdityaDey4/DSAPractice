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
public class Distence_TwoNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(8);
		root.right.right.left = new Node(9);
		int data1 = 6;
		int data2 = 8;
		int answer =0;
		if(data1 != data2) {
			answer = distenceTwoNodes(root,data1,data2);
		}
		System.out.print("Difference between "+data1+ " & "+data2+" is "+answer);
	}
	static int distenceTwoNodes(Node root, int data1, int data2) {
		Node target1 = findNode(root,data1);
		Node target2 = findNode(root,data2);
		ArrayList<Node> al1 = new ArrayList<Node>();
		ArrayList<Node> al2 = new ArrayList<Node>();
		rootToNode(root,target1,al1);
		rootToNode(root,target2,al2);
		lowestCommonAncestor(al1,al2);
		int ans = al1.size()+al2.size()-2;
		return ans;
	}
	static void lowestCommonAncestor(ArrayList<Node> al1, ArrayList<Node> al2) {
		int j=0;
		for(int i = 1; i<Math.min(al1.size(),al2.size());i++) {
			if(al1.get(i).data == al2.get(i).data) {
				al1.remove(j);
				al2.remove(j);
				j++;
			}	
		}
	}
	static boolean rootToNode(Node root, Node target, ArrayList<Node> al) {
		if(root == null) {
			return false;
		}
		else {
			al.add(root);
			if(al.get(al.size()-1).data == target.data) {
				return true;
			}
		}
		boolean left = rootToNode(root.left,target,al);
		boolean right = rootToNode(root.right,target,al);
		if(left == true || right == true) {
			return true;
		}
		else {
			al.remove(al.size()-1);
			return false;
		}
	}
	static Node findNode(Node root, int item) {
		if(root == null) {
			return null;
		}
		if(root.data == item) {
			return root;
		}
		Node left = findNode(root.left,item);
		Node right = findNode(root.right,item);
		if(left != null) {
			return left;
		}
		else if(right != null) {
			return right;
		}
		else {
			return null;
		}
	}
}
