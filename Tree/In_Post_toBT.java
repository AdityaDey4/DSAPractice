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
public class In_Post_toBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {7,4,8,2,5,1,3,9,6};
		int[] post = {7,8,4,5,2,9,6,3,1};
		setIndex(in,post);
		Node root = inPreToNode(in,post,0,in.length-1);
		printNode(root);
	}
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	static void setIndex(int[] in, int[] post) {
		for(int i=0;i<in.length;i++) {
			map.put(in[i], i);
		}
		index = in.length-1;
	}
	static int index ;
	static Node inPreToNode(int[] in, int[] post, int start, int end) {
		if(start>end) {
			return null;
		}
		Node root = new Node(post[index--]);
		int dataPosition = map.get(root.data);
		root.right = inPreToNode(in,post,dataPosition+1,end);
		root.left = inPreToNode(in,post,start,dataPosition-1);
		
		return root;
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
