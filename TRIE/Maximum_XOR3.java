package TRIE;
// Maximum XOR with an element from Array

import java.util.*;

class Node7{
	Node7[] arr = new Node7[2];
	
	boolean isContain(int bit) {
		return arr[bit] != null;
	}
	void put(int bit, Node7 node) {
		arr[bit] = node;
	}
	Node7 get(int bit) {
		return arr[bit];
	}
}
class MyData implements Comparator<MyData> {
	int num;
	int max;
	MyData(){}
	MyData(int a, int b){
		this.num = a;
		this.max = b;
	}
	@Override
	public int compare(MyData o1, MyData o2) {
		// TODO Auto-generated method stub
		if(o1.max > o2.max) {
			return 1;
		}
		else if(o2.max > o1.max) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
class Solution3{
	Node7 root;
	Solution3(){
		root = new Node7();
	}
	
	void insertion(int num) {
		Node7 node = root;
		for(int i=31; i>=0; i--) {
			int bit = (num >> i) & 1;
			if(node.isContain(bit)==false) {
				node.put(bit, new Node7());
			}
			node = node.get(bit);
		}
	}
	
	int findMaxXOR(int num) {
		Node7 node =root;
		int max = 0;
		for(int i=31; i>=0; i--) {
			int bit = (num>>i) &1;
			
			if(node.isContain(1-bit)) {
				max = max | 1<<i;
				node = node.get(1-bit);
			}else {
				node = node.get(bit);
			}
		}
		return max;
	}
}
public class Maximum_XOR3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<MyData> pq = new PriorityQueue<MyData>(new MyData());
		
		pq.add(new MyData(1,3));
		pq.add(new MyData(5,6));
		pq.add(new MyData(3,0));
		
		int arr[] = {1,2,3,4};
		Solution3 ob = new Solution3();
		
		while(! pq.isEmpty()) {
			int count = 0;
			MyData curr = pq.poll();
			for(int i=0; i<arr.length; i++) {
				if(arr[i] <= curr.max) {
					ob.insertion(arr[i]);
					count++;
				}
			}
			if(count == 0) {
				System.out.println(curr.num+" , "+curr.max+" : "+-1);
			}else {
				int ans = ob.findMaxXOR(curr.num);
				System.out.println(curr.num+" , "+curr.max+" : "+ans);
			}
		}
	}

}
