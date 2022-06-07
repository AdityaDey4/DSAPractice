package TRIE;
/*
  	In this program , I am inserting word, counting words,
  	count wordsStartingWith some words.
 */

class Node2{
	Node2[] arr = new Node2[26];
	int cw;
	int tw;
	Node2() {
		cw = 0;
		tw = 0;
	}
	
	boolean contain(char c) {
		if(arr[c-'a'] == null) {
			return false;
		}
		return true;
	}
	
	void putNode(char c, Node2 node) {
		arr[c-'a'] = node;
	}
	Node2 getNode(char c) {
		Node2 node = arr[c-'a'];
		node.cw = node.cw+1;
		return node;
	}
	Node2 getNodeForCount(char c) {
		return arr[c-'a'];
	}
}
public class CountWords {
	Node2 root;
	CountWords(){
		root = new Node2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWords ob = new CountWords();
		ob.insertion("apple");
		ob.insertion("apple");
		ob.insertion("apps");
		
		System.out.println(ob.countWords("apple"));
		System.out.println(ob.countWords("appse"));
		System.out.println(ob.countWordStartingWith("app"));
		System.out.println(ob.countWordStartingWith("ape"));
	}
	void insertion(String name) {
		Node2 node = root;
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(node.contain(c) == false) {
				node.putNode(c, new Node2());
			}
			node = node.getNode(c);
		}
		node.tw = node.tw+1;
	}
	int countWords(String name) {
		Node2 node = root;
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(! node.contain(c)) {
				return 0;
			}
			node = node.getNodeForCount(c);
		}
		return node.tw;
	}
	int countWordStartingWith(String name) {
		Node2 node = root;
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(! node.contain(c)) {
				return 0;
			}
			node = node.getNodeForCount(c);
		}
		return node.cw;
	}
}
