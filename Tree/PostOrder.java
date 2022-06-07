package Tree;

public class PostOrder {
	int data;
	PostOrder left;
	PostOrder right;
	PostOrder(int data){
		this.data = data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOrder root = new PostOrder(1);
		root.left = new PostOrder(2);
		root.right = new PostOrder(3);
		root.left.left = new PostOrder(4);
		root.left.right = new PostOrder(5);
		root.left.right.left = new PostOrder(6);
		root.right.left = new PostOrder(7);
		postorder(root);
	}
	static void postorder(PostOrder root) {
		if(root == null) {
			return ;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}
