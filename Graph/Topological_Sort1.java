package Graph;

import java.util.*;

public class Topological_Sort1 {
	int V;
	LinkedList<Integer>[] al;
	Topological_Sort1(int v){
		this.V = v;
		al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topological_Sort1 ob = new Topological_Sort1(6);
		ob.addEdge(1, 0);
		ob.addEdge(2, 0);
		ob.addEdge(3, 5);
		ob.addEdge(4, 5);
		ob.addEdge(1, 3);
		ob.addEdge(2, 4);
		//ob.printGraph();
		ob.topologicalSort();
	}
	void DFS(boolean[] visited, Stack<Integer> s, int data) {
		visited[data]=true;
		for(Integer it : al[data]) {
			if(visited[it]==false) {
				DFS(visited,s,it);
			}
		}
		s.add(data);
	}
	void topologicalSort() {
		boolean[] visited = new boolean[V];
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				DFS(visited,s,i);
			}
		}
		for(int i=s.size()-1;i>=0;i--) {
			System.out.print(s.get(i)+" ");
		}
	}
	void printGraph() {
		for(int i=0;i<al.length;i++) {
			System.out.print("Vertex "+i+" : ");
			for(int j=0;j<al[i].size();j++) {
				System.out.print(al[i].get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(int i, int j) {
		al[i].add(j);
	}
}
