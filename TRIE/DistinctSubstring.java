package TRIE;

// total number of distinct substring in the string
class Node4{
	Node4[] arr = new Node4[26];
	boolean flag;
	Node4() {
		flag = false;
	}
	boolean isContain(char c) {
		if(arr[c-'a']==null) {
			return false;
		}
		return true;
	}
	void put(char c, Node4 n) {
		arr[c-'a'] = n;
	}
	Node4 get(char c) {
		return arr[c-'a'];
	}
}
public class DistinctSubstring {
	Node4 root;
	DistinctSubstring(){
		root = new Node4();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctSubstring ob = new DistinctSubstring();
		
		System.out.print("Total Distinct Substring : "+ob.getTotalSubstring("abab"));
		
	}
	int getTotalSubstring(String name) {
		Node4 node ;
		int count =0;
		for(int i=0; i<name.length(); i++){
			node = root;
			for(int j=i; j<name.length(); j++) {
				if(! node.isContain(name.charAt(j))) {
					node.put(name.charAt(j), new Node4());
					count++;
				}
				node = node.get(name.charAt(j));
			}
		}
		return count+1;
	}
}
