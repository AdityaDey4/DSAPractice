package Graph;

import java.util.*;

class Graph
{
	LinkedList<Integer>[] ll ;
	Graph(int num){
		ll = new LinkedList[num];
		for(int i=0;i<num;i++) {
			ll[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int i, int j) {
		ll[i].add(j);
	}
	
	void topologicalSort() {
		boolean[] visited = new boolean[ll.length];
		Stack<Character> s = new Stack<Character>();
		Arrays.fill(visited, false);
		
		for(int i=0;i<ll.length;i++) {
			if(visited[i]==false) {
				topologicalSortUtil(i,visited, s);
			}
		}
		
		while(! s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
	}
	
	void topologicalSortUtil(int i, boolean[] visited, Stack<Character> s) {
		visited[i]=true;
		for(int it: ll[i]) {
			if(visited[it]==false) {
				topologicalSortUtil(it,visited,s);
			}
		}
		s.push((char) (i+'a'));
	}
}
public class Alian_Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"baa","abcd","abca","cab","cad"};
		int N = words.length, ch = 4;
		printOrder(words, N, ch);
	}
	static void printOrder(String[] words, int N, int ch) {
		Graph gh = new Graph(ch);
		
		for(int i=0;i<N-1;i++) {
			
			String word1 = words[i];
			String word2 = words[i+1];
			
			for(int j=0; j< Math.min(word1.length(), word2.length());j++) {
				if(word1.charAt(j) != word2.charAt(j)) {
					gh.addEdge( word1.charAt(j)-'a',  word2.charAt(j)-'a');
					break;
				}
			}
		}
		gh.topologicalSort();
	}

}
