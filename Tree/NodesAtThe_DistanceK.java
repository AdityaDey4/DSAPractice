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
public class NodesAtThe_DistanceK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(8);
		Node target = root.left;
		int k = 2;
		printNodes(root,target,k);
	}
	static void printNodes(Node root, Node target, int k) {
		HashMap<Node,Node> map = new HashMap<Node,Node>();
		parentChild(root,map);
		List<Node> al = checkingNodes(root,target,k,map);
		for(int i=0; i<al.size();i++) {
			System.out.print(al.get(i).data+" ");
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
	static List<Node> checkingNodes(Node root, Node target, int k, HashMap<Node,Node> map) {
		List<Node> al = new ArrayList<Node>();
		HashSet<Node> set = new HashSet<Node>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(target);
		while(! q.isEmpty()) {
			int size = q.size();
			for(int i=0; i<size ;i++) {
				Node curr = q.poll();
				set.add(curr);
				if(k==0) {
					al.add(curr);
				}
				if(map.containsKey(curr) && !set.contains(map.get(curr))) {
					q.add(map.get(curr));
				}
				if(curr.left != null && set.contains(curr.left)==false) {
					q.add(curr.left);
				}
				if(curr.right != null && set.contains(curr.right)==false) {
					q.add(curr.right);
				}
			}
			k--;
			if(k<0) {
				break;
			}
		}
		return al;
	}
}

