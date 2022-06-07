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
public class Lowest_Common_Ancestor {

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
		int a = 4, b = 9;
		lCA(root,a,b);
	}
	static void lCA(Node root, int a , int b){
		ArrayList<Integer> al1 = new ArrayList<>();
		createPath(root,a,al1);
		ArrayList<Integer> al2 = new ArrayList<>();
		createPath(root,b,al2);
		int ans=0;
		for(int i = 0; i<Math.min(al1.size(),al2.size());i++) {
			if(al1.get(i)==al2.get(i)) {
				ans = al1.get(i);
			}
		}
		System.out.print(ans);
	}
	static boolean createPath(Node root, int data, ArrayList<Integer> al) {
		if(root == null){
			return false;
		}
		else {
			al.add(root.data);
			if(al.get(al.size()-1) == data) {
				return true;
			}
		}
		boolean left = createPath(root.left,data,al);
		boolean right = createPath(root.right,data,al);
		if(left == true || right == true) {
			return true;
		}
		if(left == false && right == false) {
			al.remove(al.size()-1);
		}
		return false;
	}

}
