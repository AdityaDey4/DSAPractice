package TRIE;

/*
 	In this program through Tries Data Structure I am 
 	Inserting string , Searching the String , StartsWith the String or not
 */

class Node{
	Node[] arr = new Node[26];
	boolean flag;
	Node() {
		flag = false;
	}
	boolean isContain(char c) {
		if(arr[c-'a']==null) {
			return false;
		}
		return true;
	}
	void put(char c, Node n) {
		arr[c-'a'] = n;
	}
	Node get(char c) {
		return arr[c-'a'];
	}
}
public class Insertion {
	Node root;
	Insertion(){
		root = new Node();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion ob = new Insertion();
		
		ob.insert("apple");
		ob.insert("apps");
		System.out.println(ob.startsWith("app"));
		System.out.println(ob.search("app"));
		System.out.println(ob.search("apps"));
	}
	void insert(String name) {
		Node node = root;
		for(int i=0; i<name.length(); i++) {
			if(! node.isContain(name.charAt(i))) {
				node.put(name.charAt(i), new Node());
			}
			node = node.get(name.charAt(i));
		}
		node.flag = true;
	}
	boolean search(String name) {
		Node node = root;
		for(int i=0;i<name.length();i++) {
			if(! node.isContain(name.charAt(i))) {
				return false;
			}
			node =node.get(name.charAt(i));
		}
		return node.flag;
	}
	boolean startsWith(String name) {
		Node node = root;
		for(int i=0; i<name.length(); i++) {
			if(! node.isContain(name.charAt(i))) {
				return false;
			}
			node =node.get(name.charAt(i));
		}
		return true;
	}
}
