package BST;

public class PostToPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,6,9,7,5};
		postOrderToPreOrder(arr, arr.length-1, 0);
	}
	static void postOrderToPreOrder(int[] arr, int start, int end) {
		if(start < end) {
			return ;
		}
		int curr = start-1;
		while(curr >= end && arr[start] < arr[curr]) {
			curr--;
		}
		System.out.print(arr[start]+" ");
		postOrderToPreOrder(arr,curr,end);
		postOrderToPreOrder(arr,start-1,curr+1);
	}
}
