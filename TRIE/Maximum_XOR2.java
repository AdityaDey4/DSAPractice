package TRIE;
// // Maximum XOR between one element of two array

class Node6{
	Node6 arr[] = new Node6[2];
	Node6() {}
	
	boolean contains(int bit) {
		if(arr[bit]==null) {
			return false;
		}
		return true;
	}
	
	void put(int bit, Node6 node) {
		arr[bit]=node;
	}
	
	Node6 get(int bit) {
		return arr[bit];
	}
}
class Solution2{
	Node6 root;
	Solution2(){
		root = new Node6();
	}
	void accessData(int arr[], int arr2[]) {
		
		for(int i=0; i<arr.length; i++) {
			insertion(arr[i]);
		}
		
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<arr2.length; i++) {
			ans = Math.max(ans, findMax(arr2[i]));
		}
		
		System.out.print(ans);
	}
	int findMax(int N) {
		Node6 node = root;
		int max = 0;
		for(int i=31; i>=0; i--) {
			int bit = (N>>i) & 1;
			if(node.contains(1-bit)) {
				max = max | (1<<i);
				node = node.get(1-bit);
			}else {
				node = node.get(bit);
			}
		}
		return max;
	}
	void insertion(int data) {
		Node6 node = root;
		for(int i=31; i>=0; i--) {
			int bit = (data >> i) &1;
			if(! node.contains(bit)) {
				node.put(bit, new Node6());
			}
			node = node.get(bit);
		}
	}
	
}
public class Maximum_XOR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,7,5,4};
		int arr2[] = {3,6,7};
		
		Solution2 ob = new Solution2();
		ob.accessData(arr, arr2);
	}

}
