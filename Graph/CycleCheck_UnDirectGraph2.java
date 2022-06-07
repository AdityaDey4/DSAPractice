package Graph;

import java.util.LinkedList;

public class CycleCheck_UnDirectGraph2 {
	int V;
	LinkedList<Integer>[] al;
	CycleCheck_UnDirectGraph2(int v){
		this.V = v;
		al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleCheck_UnDirectGraph2 ob = new CycleCheck_UnDirectGraph2(8);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(3, 4);
		ob.addEdge(5, 4);
		ob.addEdge(5, 6);
		//ob.addEdge(4, 6);
		ob.addEdge(6, 7);
		//ob.printGraph();
		boolean res = ob.checkCycle();
		System.out.print("Cycle : "+res);
	}
	boolean DFS(boolean[] visited, int data, int parent) {
		visited[data]=true;
		for(Integer it : al[data]) {
			if(visited[it] == false) {
				if(DFS(visited,it,data)==true) {
					return true;
				}
			}
			else if(it != parent) {
				return true;
			}
		}
		return false;
	}
	boolean  checkCycle() {
		boolean[] visited = new boolean[V];
		for(int i=0;i<V;i++) {
			if(visited[i] == false) {
				if(DFS(visited,i,-1)) {
					return true;
				}
			}
		}
		return false;
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
		al[j].add(i);
	}
}
