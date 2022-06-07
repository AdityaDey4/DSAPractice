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
public class Top_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.left.right = new Node(5);
		root.right.left.right.right = new Node(6);
		root.right.left.right.right.left = new Node(7);
		root.right.left.right.right.right = new Node(8);
		printTopView(root);
	}
	static void printTopView(Node root) {
		HashMap<Integer,Node> map = new HashMap<Integer,Node>();
		findTopView(root,0,map);
		for(Map.Entry<Integer, Node> m : map.entrySet()) {
			Node n = m.getValue();
			System.out.print(n.data+" ");
		}
	}
	static void findTopView(Node root, int level, HashMap<Integer,Node> map) {
		if(root == null) {
			return ;
		}
		map.putIfAbsent(level, root);
		findTopView(root.left,level-1,map);
		findTopView(root.right,level+1,map);
	}
}
