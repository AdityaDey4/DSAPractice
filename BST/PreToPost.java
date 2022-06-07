package BST;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class PreToPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,2,7,6,9}; // preorder of binary search tree
		preToPost(arr);
	}
	static void preToPost(int[] arr) {
		addData(arr,0,arr.length-1);
	}
	static void addData(int[] arr, int start, int end) {
		if(start > end) {
			return;
		}
		int curr = start+1;
		while(curr <= end && arr[start] > arr[curr]) {
			curr++;
		}
		if(curr == start) {
			return ;
		}
		addData(arr, start+1, curr-1);
		addData(arr, curr, end);
		System.out.print(arr[start]+",");
	}
}
