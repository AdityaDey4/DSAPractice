package BST;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class Search {
	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s = new Search();
		s.root = new Node(6);
		s.root.left = new Node(3);
		s.root.right = new Node(10);
		s.root.left.left = new Node(1);
		s.root.left.right = new Node(4);
		s.root.left.left.right = new Node(2);
		s.root.right.left = new Node(8);
		s.root.right.right = new Node(11);
		s.root.right.left.left = new Node(7);
		s.root.right.left.right = new Node(9);
		int data = 2;
		s.searchData(s.root,data);
	}
	void searchData(Node root, int data) {
		if(root == null) {
			return ;
		}
		if(root.data == data) {
			System.out.print(data+" is present in the Binary Search Tree");
			return;
		}
		if(data > root.data) {
			searchData(root.right,data);
		}else {
			searchData(root.left,data);
		}
	}

}
