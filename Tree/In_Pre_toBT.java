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
public class In_Pre_toBT {
	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {7,4,8,2,5,1,3,9,6};
		int[] pre = {1,2,4,7,8,5,3,6,9};
		int end = in.length-1;
		Node root = search(in,pre,0,end);
		printNode(root);
	}
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	static Node operations(int[] in, int[] pre, int start, int end) {
		if(start>end) {
			return null;
		}
		Node root = new Node(pre[index++]);
		int dataPosition = map.get(root.data);    
		root.left = operations(in,pre,start,dataPosition-1);
		root.right = operations(in,pre,dataPosition+1,end);
		return root;
	}
	static Node search(int[] in, int[] pre, int start, int end) {
		int i;
		for(i=start; i<=end; i++) {
			map.put(in[i], i);
		}
		return operations(in,pre,start,end);
	}
	static void printNode(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(q.isEmpty() == false) {
			Node curr = q.poll();
			if(curr == null) {
				if(q.isEmpty()) {
					break;
				}
				else {
					System.out.println();
					q.add(null);
					continue;
				}
			}
			System.out.print(curr.data+" ");
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
		}
	}
}
