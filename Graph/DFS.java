package Graph;

import java.util.*;

public class DFS {
	static int V = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			map.put(i, new ArrayList<Integer>());
		}
		DFS ob = new DFS();
		ob.addEdge(map,0,1);
		ob.addEdge(map,0,2);
		ob.addEdge(map,1,2);
		ob.addEdge(map,2,5);
		ob.addEdge(map,3,2);
		ob.addEdge(map,4,1);
		ob.addEdge(map,4,3);
		ob.printGraph(map);
		ob.DFSTraversal(map);
	}
	void travers(HashMap<Integer,ArrayList<Integer>> map, int data, boolean[] visited) {
		if(visited[data] == true) {
			return;
		}
		visited[data] = true;
		ArrayList<Integer> al = map.get(data);
		for(int i=0 ; i<al.size() ;i++) {
			travers(map,al.get(i),visited);
		}
		System.out.print(data+" ");
	}
	void DFSTraversal(HashMap<Integer,ArrayList<Integer>> map) {
		boolean[] visited = new boolean[V];
		System.out.print("DFS Traversal Starting From Minimum Value  :  ");
		for(int i=0; i< visited.length ;i++) {
			if(visited[i] == false) {
				travers(map,i,visited);
			}
		}
	}
	void printGraph(HashMap<Integer,ArrayList<Integer>> map) {
		for(int i=0;i<map.size()-1;i++) {
			System.out.print("Vertex "+i+" : ");
			ArrayList<Integer> al = map.get(i);
			for(int j=0;j<al.size();j++) {
				System.out.print(al.get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(HashMap<Integer,ArrayList<Integer>> map, int i, int j) {
		map.get(i).add(j);
	}
}
