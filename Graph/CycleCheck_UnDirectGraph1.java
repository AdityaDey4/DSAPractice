package Graph;

import java.util.*;

public class CycleCheck_UnDirectGraph1 {
	int V;
	LinkedList<Integer>[] al;
	CycleCheck_UnDirectGraph1(int v){
		this.V = v;
		al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleCheck_UnDirectGraph1 ob = new CycleCheck_UnDirectGraph1(8);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(3, 4);
		ob.addEdge(5, 4);
		ob.addEdge(5, 6);
		ob.addEdge(4, 6);
		ob.addEdge(6, 7);
		ob.printGraph();
		boolean res = ob.checkCycle();
		System.out.print("Cycle : "+res);
	}
	class Node {
		int data;
		int par;
		Node(int data, int par){
			this.data = data;
			this.par = par;
		}
	}
	boolean BFS(boolean[] visited, int data) {
		Queue<Node> q = new LinkedList<Node>();
		visited[data]=true;
		q.add(new Node(data,-1));
		while(! q.isEmpty()) {
			Node ele = q.poll();
			for(Integer it : al[ele.data]) {
				if(visited[it] == false) {
					q.add(new Node(it,ele.data));
					visited[it] = true;
				}
				else if(it != ele.par) {
					return true;
				}
			}
		}
		return false;
	}
	boolean  checkCycle() {
		boolean[] visited = new boolean[V];
		for(int i=0;i<V;i++) {
			if(visited[i] == false) {
				if(BFS(visited,i)) {
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
