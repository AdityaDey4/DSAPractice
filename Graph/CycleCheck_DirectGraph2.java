package Graph;

import java.util.*;

public class CycleCheck_DirectGraph2 {
	int V;
	HashMap<Integer,ArrayList<Integer>> map;
	CycleCheck_DirectGraph2(int v){
		map = new HashMap<Integer,ArrayList<Integer>>();
		this.V = v;
		for(int i =0; i<V ;i++) {
			map.put(i, new ArrayList<Integer>());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleCheck_DirectGraph2 ob = new CycleCheck_DirectGraph2(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 3);
		ob.addEdge(1, 0);
		//ob.addEdge(2, 1);
		ob.addEdge(2, 4);
		ob.addEdge(3, 2);
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
	boolean BFS(boolean[] visited, int data, int parent) {
		Queue<Node> q = new LinkedList<Node>();
		visited[data] = true;
		q.add(new Node(data,parent));
		while(! q.isEmpty()) {
			Node ele = q.poll();
			int size = map.get(ele.data).size();
			for(int i=0;i<size;i++) {
				if(visited[map.get(ele.data).get(i)]==false) {
					q.add(new Node(map.get(ele.data).get(i),ele.data));
					visited[map.get(ele.data).get(i)]=true;
				}
				else if(ele.par != map.get(ele.data).get(i)) {
					return true;
				}
			}
			
		}
		return false;
	}
	boolean checkCycle() {
		boolean[] visited = new boolean[V];
		for(int i = 0; i< V ;i++) {
			if(visited[i] == false) {
				if(BFS(visited,i,Integer.MAX_VALUE)) {
					return true;
				}
			}
		}
		return false;
	}
	void printGraph() {
		for(int i=0;i<map.size();i++) {
			System.out.print("Vertex "+i+" : ");
			ArrayList<Integer> al = map.get(i);
			for(int j=0;j<al.size();j++) {
				System.out.print(al.get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(int i, int j) {
		map.get(i).add(j);
	}
}
