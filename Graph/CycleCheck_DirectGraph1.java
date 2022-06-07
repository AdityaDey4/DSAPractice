package Graph;

import java.util.*;

public class CycleCheck_DirectGraph1 {
	int V;
	HashMap<Integer,ArrayList<Integer>> map;
	CycleCheck_DirectGraph1(int v){
		map = new HashMap<Integer,ArrayList<Integer>>();
		this.V = v;
		for(int i =0; i<V ;i++) {
			map.put(i, new ArrayList<Integer>());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleCheck_DirectGraph1 ob = new CycleCheck_DirectGraph1(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 3);
		ob.addEdge(2, 1);
		ob.addEdge(2, 4);
		ob.addEdge(3, 2);
		//ob.printGraph();
		ob.checkCycle();
		System.out.print("Cycle : "+ob.res);
	}
	private boolean res = false;
	void DFS(int data, int parent, boolean[] visited, HashSet<Integer> set){
		if(set.contains(data)) {
			res = true;
			return ;
		}
		else {
			visited[data] = true;
			set.add(data);
		}
		for(int i=0; i<map.get(data).size(); i++) {
			if(map.get(data).get(i) != parent) {
				DFS(map.get(data).get(i), data, visited, set);
			}
		}
	}
	void checkCycle() {
		boolean[] visited = new boolean[V];
		for(int i = 0; i<V ;i++) {
			if(visited[i] == false) {
				HashSet<Integer> set = new HashSet<Integer>();
				DFS(i,Integer.MAX_VALUE,visited,set);
			}
		}
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
