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
public class Right_View {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(9);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(8);
		root.right.left.right = new Node(0);
		leftViewPrint(root);
	}
	static void leftViewPrint(Node root) {
		HashMap<Integer,Node> map = new HashMap<Integer,Node>();
		findRightView(root,1,map);
		for(Map.Entry<Integer, Node> m: map.entrySet()) {
			 Node r = m.getValue();
			 System.out.print(r.data+" ");
		 }
	}
	static void findRightView(Node root, int index, HashMap<Integer,Node> map) {
		if(root == null) {
			return ;
		}
		map.put(index, root);
		findRightView(root.left, index+1,map);
		findRightView(root.right, index+1,map);
	}
}
