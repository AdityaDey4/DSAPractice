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
public class K_DistanceNodes {

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
		int data = 3;
		kDistenceNode(root,data);
	}
	static int k = 2;
	static void kDistenceNode(Node root,int data) {
		Node target = findNode(root,data);
		HashMap<Node,Node> map = new HashMap<Node,Node>();
		parentChild(root,map);
		HashMap<Node,Integer> map2 = new HashMap<Node,Integer>();
		checkNodes(target,map2,map);
		for(Map.Entry<Node, Integer> m : map2.entrySet()) {
			if(m.getValue()>k) {
				System.out.print(m.getKey().data+" ");
			}
		}
	}
	static void checkNodes(Node target, HashMap<Node,Integer> map2, HashMap<Node,Node> map) {
		Queue<Node> q = new LinkedList<Node>();
		HashSet<Node> set = new HashSet<Node>();
		q.add(target);
		int level = 0;
		while(! q.isEmpty()) {
			int size = q.size();
			level +=1;
			for(int i=0;i<size;i++) {
				Node curr = q.poll();
				set.add(curr);
				
				if(map.containsKey(curr) && !set.contains(map.get(curr))) {
					q.add(map.get(curr));
					map2.put( map.get(curr),level);
				}
				if(curr.left!= null && !set.contains(curr.left)) {
					q.add(curr.left);
					map2.put( curr.left,level);
				}
				if(curr.right!= null && !set.contains(curr.right)) {
					q.add(curr.right);
					map2.put(curr.right,level);
				}
			}
		}
	}
	static void parentChild(Node root, HashMap<Node,Node> map) {
		if(root == null) {
			return;
		}
		if(root.left != null) {
			map.put(root.left, root);
		}
		if(root.right != null) {
			map.put(root.right, root);
		}
		parentChild(root.left,map);
		parentChild(root.right,map);
	}
	static Node findNode(Node root,int data) {
		if(root == null) {
			return null ;
		}
		if(root.data == data) {
			return root;
		}
		Node left = findNode(root.left,data);
		Node right = findNode(root.right,data);
		if(left != null || right != null) {
			if(left!=null) {
				return left;
			}
			else {
				return right;
			}
		}
		else {
			return null;
		}
	}
}
