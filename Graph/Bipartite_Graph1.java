package Graph;

import java.util.LinkedList;

public class Bipartite_Graph1 {
	int V;
	LinkedList<Integer>[] al;
	Bipartite_Graph1(int v){
		this.V = v;
		al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bipartite_Graph1 ob = new Bipartite_Graph1(10);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(3, 4);
		ob.addEdge(4, 5);
		ob.addEdge(5, 6);
		ob.addEdge(6, 8);
		ob.addEdge(6, 7);
		ob.addEdge(6, 9);
		//ob.addEdge(7, 4);
		//ob.addEdge(8, 9);
		ob.addEdge(9, 5);
		//ob.printGraph();
		boolean ans = ob.bipartiteGraph();
		System.out.print("Is Bipartite Graph : "+ans);
	}
	boolean DFS(boolean[] visited, int[] arr, int data, int par) {
		visited[data]=true;
		if(arr[par]==1) {
			arr[data]=0;
		}else {
			arr[data]=1;
		}
		for(Integer it : al[data]) {
			if(visited[it]==false) {
				if(DFS(visited,arr,it,data)==false) {
					return false;
				}
			}
			else if(it != par && arr[it] == arr[data]) {
				return false;
			}
		}
		return true;
	}
	boolean bipartiteGraph() {
		boolean[] visited = new boolean[V];
		int[] arr = new int[V];
		for(int i =0; i< V;i++) {
			arr[i]=-1;
		}
		for(int i = 0; i< V; i++) {
			if(visited[i] == false) {
				arr[i]=0;
				if(! DFS(visited,arr,i,i)) {
					return false;
				}
			}
		}
		return true;
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
