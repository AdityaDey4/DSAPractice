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
public class Vertical_View {

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
		printVerticalView(root);
	}
	static void printVerticalView(Node root) {
		TreeMap<Integer,Queue<Node>> map = new TreeMap<>();
		setUpHashMap(root,0,map);
		for(Map.Entry<Integer, Queue<Node>> m : map.entrySet()) {
			Queue<Node> p = m.getValue();
			while(!p.isEmpty()) {
				System.out.print(p.poll().data+" ");
			}
			
		}
	}
	static void setUpHashMap(Node root, int level, TreeMap<Integer,Queue<Node>> map) {
		if(root == null) {
			return ;
		}
		Queue<Node> al = map.get(level);
		if(al == null) {
			al = new LinkedList<Node>();
			al.add(root);
		}
		else {
			al.add(root);
		}
		map.put(level, al);
		setUpHashMap(root.left,level-1,map);
		setUpHashMap(root.right,level+1,map);
	}
}
