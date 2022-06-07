package Graph;


import java.util.*;

public class Topological_Sort2 {
	int V;
	LinkedList<Integer>[] al;
	Topological_Sort2(int v){
		this.V = v;
		al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topological_Sort2 ob = new Topological_Sort2(7);
		ob.addEdge(1, 0);
		ob.addEdge(2, 0);
		ob.addEdge(3, 5);
		ob.addEdge(4, 5);
		ob.addEdge(1, 3);
		ob.addEdge(2, 4);
		ob.addEdge(3, 6);
		//ob.printGraph();
		ob.topologicalSort();
	}
	void BFS(boolean[] visited, Stack<Integer> s, int data) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(data);
		visited[data]=true;
		s.push(data);
		while(! q.isEmpty()) {
			int curr = q.poll();
			for(Integer it : al[curr]) {
				if(visited[it]== false) {
					q.add(it);
					visited[it]=true;
					s.push(it);
				}
			}
		}
	}
	void putStackData(Stack<Integer> s1, Stack<Integer> s2) {
		for(int i=s2.size()-1;i>=0;i--) {
			s1.push(s2.get(i));
		}
	}
	void topologicalSort() {
		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);
		Stack<Integer> s= new Stack<Integer>();
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				Stack<Integer> s2 = new Stack<Integer>();
				BFS(visited,s2,i);
				putStackData(s,s2);
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
