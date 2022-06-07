package TRIE;

/*
  In this program, I am finding the longest word 
  with all prefixes are exist.
 */
class Node3{
	Node3[] arr = new Node3[26];
	boolean flag;
	Node3() {
		flag = false;
	}
	boolean isContain(char c) {
		if(arr[c-'a']==null) {
			return false;
		}
		return true;
	}
	void put(char c, Node3 n) {
		arr[c-'a'] = n;
	}
	Node3 get(char c) {
		return arr[c-'a'];
	}
	boolean isTrue(char c) {
		if(arr[c-'a'].flag) {
			return true;
		}
		return false;
	}
}
public class LongestWord {
	Node3 root ;
	LongestWord(){
		root = new Node3();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestWord ob = new LongestWord();
		String[] arr = {"a", "adi", "d", "i",  "ad", "aadi"};
		
		for(int i=0; i<arr.length; i++) {
			ob.insert(arr[i]);
		}
		
		ob.findLongestWord(arr);
	}
	void insert(String name) {
		Node3 node = root;
		for(int i=0; i<name.length(); i++) {
			if(! node.isContain(name.charAt(i))) {
				node.put(name.charAt(i), new Node3());
			}
			node = node.get(name.charAt(i));
		}
		node.flag = true;
	}
	void findLongestWord(String[] arr) {
		String ans = "";
		for(int i=0; i<arr.length; i++) {
			if(isLong(arr[i])) {
				if(ans.length() < arr[i].length()) {
					ans = arr[i];
				}
			}
		}
		if(ans.equals("")) {
			System.out.print("Longest word is not exist....");
		}else {
			System.out.print(ans);
		}
	}
	boolean isLong(String name) {
		Node3 node = root;
		for(int i=0; i<name.length(); i++) {
			if(! node.isTrue(name.charAt(i))) {
				return false;
			}
			node = node.get(name.charAt(i));
		}
		return node.flag;
	}
}
