
package Graph;

import java.util.*;

public class Bipartite_Graph2 {
	int V;
	LinkedList<Integer>[] al;
	Bipartite_Graph2(int v){
		this.V = v;
		al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bipartite_Graph2 ob = new Bipartite_Graph2(10);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(3, 4);
		ob.addEdge(4, 5);
		ob.addEdge(5, 6);
		ob.addEdge(6, 8);
		ob.addEdge(6, 7);
		ob.addEdge(6, 9);
		ob.addEdge(7, 4);
		ob.addEdge(8, 9);
		ob.addEdge(9, 5);
		//ob.printGraph();
		boolean ans = ob.bipartiteGraph();
		System.out.print("Is Bipartite Graph : "+ans);
	}
	class Node{
		int data;
		int par;
		Node(int data, int par){
			this.data = data;
			this.par = par;
		}
	}
	boolean BFS(boolean[] visited, int[] arr, int data) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(data,data));
		visited[data]=true;
		while(! q.isEmpty()){
			Node curr = q.poll();
			for(Integer it : al[curr.data]) {
				if(visited[it]==false) {
					q.add(new Node(it,curr.data));
					visited[it]=true;
					if(arr[curr.data]==0) {
						arr[it]=1;
					}else {
						arr[it]=0;
					}
				}
				else if(it != curr.par && arr[it]==arr[curr.data]) {
					return false;
				}
			}
		}
		return true;
	}
	boolean bipartiteGraph() {
		boolean[] visited = new boolean[V];
		int[] arr = new int[V];
		for(int i=0;i<V;i++) {
			arr[i]=-1;
		}
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				arr[i]=0;
				if(! BFS(visited,arr,i)) {
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
