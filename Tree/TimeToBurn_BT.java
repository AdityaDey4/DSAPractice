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
public class TimeToBurn_BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeToBurn_BT ob = new TimeToBurn_BT();
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
		int data = 5;
		Node target = ob.findTarget(root,data);
		//System.out.print(target.left.data);
		ob.printTimeToBurn(root,target);
	}
	Node findTarget(Node root, int data) {
		if(root == null) {
			return null ;
		}
		Node ans;
		Queue<Node> al = new LinkedList<Node>();
		al.add(root);
		while(al.isEmpty() == false) {
			Node curr = al.poll();
			if(curr.data == data) {
				ans = curr;
				return ans;
			}
			if(curr.left != null) {
				al.add(curr.left);
			}
			if(curr.right != null) {
				al.add(curr.right);
			}
		}
		return null;
	}
	void printTimeToBurn(Node root, Node target) {
		HashMap<Node,Node> map = new HashMap<Node,Node>();
		parentChild(root,map);
		int ans = requiredTime(root,target,map);
		System.out.print(ans);
	}
	void parentChild(Node root, HashMap<Node,Node> map) {
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
	int requiredTime(Node root,Node target, HashMap<Node,Node> map) {
		HashSet<Node> visited = new HashSet<Node>();
		Queue<Node> q= new LinkedList<Node>();
		q.add(target);
		int res=0;
		while(! q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node curr = q.poll();
				visited.add(curr);
				if(map.containsKey(curr) && !visited.contains(map.get(curr))) {
					q.add(map.get(curr));
				}
				if(curr.left != null && !visited.contains(curr.left)) {
					q.add(curr.left);
				}
				if(curr.right != null && !visited.contains(curr.right)) {
					q.add(curr.right);
				}
			}
			res+=1;
		}
		return res-1;
	}
}
