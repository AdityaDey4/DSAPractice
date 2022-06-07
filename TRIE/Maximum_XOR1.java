package TRIE;
// Maximum XOR between one element of array & N

class Node5{
	Node5 arr[] = new Node5[2];
	Node5() {}
	
	boolean contains(int bit) {
		if(arr[bit]==null) {
			return false;
		}
		return true;
	}
	
	void put(int bit, Node5 node) {
		arr[bit]=node;
	}
	
	Node5 get(int bit) {
		return arr[bit];
	}
}
class Solution{
	Node5 root;
	Solution(){
		root = new Node5();
	}
	void accessData(int arr[], int N) {
		
		for(int i=0; i<arr.length; i++) {
			insertion(arr[i]);
		}
		findMax(N);
	}
	void findMax(int N) {
		Node5 node = root;
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
		System.out.print(max);
	}
	void insertion(int data) {
		Node5 node = root;
		for(int i=31; i>=0; i--) {
			int bit = (data >> i) &1;
			if(! node.contains(bit)) {
				node.put(bit, new Node5());
			}
			node = node.get(bit);
		}
	}
	
}
public class Maximum_XOR1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,7,5,4};
		int N = 8;
		
		Solution ob = new Solution();
		ob.accessData(arr, N);
	}

}
