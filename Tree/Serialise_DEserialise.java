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
public class Serialise_DEserialise {

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
		String str = serialise(root);
		System.out.print(str);
		System.out.println();
		Node c_root = deSerialise(str);
		printNode(c_root);
	}
	static String serialise(Node root) {
		if(root == null) {
			return null;
		}
		List<String> str = new ArrayList<String>();
		Stack<Node> q = new Stack<Node>();
		q.add(root);
		while(q.isEmpty() == false) {
			Node curr = q.pop();
			if(curr == null) {
				str.add("#");
				continue;
			}
			str.add(""+curr.data);
			q.add(curr.right);
			q.add(curr.left);
		}
		return String.join(" ", str);
	} 
	static int index=0;
	static Node deSerialise(String s) {
		if(s == null) {
			return null;
		}
		String[] arr = s.split(" ");
		return createNodes(arr);
	}
	static Node createNodes(String[] arr) {
		if(arr[index].equals("#")) {
			return null;
		}
		Node root = new Node(Integer.parseInt(arr[index]));
		index++;
		root.left = createNodes(arr);
		index++;
		root.right = createNodes(arr);
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
