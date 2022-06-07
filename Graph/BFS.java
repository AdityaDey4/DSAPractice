package Graph;

import java.util.*;

public class BFS {
	static int V = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			map.put(i, new ArrayList<Integer>());
		}
		BFS ob = new BFS();
		ob.addEdge(map,0,1);
		ob.addEdge(map,0,2);
		ob.addEdge(map,1,2);
		ob.addEdge(map,2,2);
		ob.addEdge(map,3,2);
		ob.addEdge(map,4,1);
		ob.addEdge(map,4,3);
		ob.printGraph(map);
		ob.BFSTraversal(map);
	}
	void travers(HashMap<Integer,ArrayList<Integer>> map, int data, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		q.add(data);
		visited[data] = true;
		while(! q.isEmpty()) {
			int item = q.poll();
			System.out.print(item+" ");
			ArrayList<Integer> al = map.get(item);
			for(int i = 0; i< al.size(); i++) {
				if(visited[al.get(i)] == false)
				{
					visited[al.get(i)] = true;
					q.add(al.get(i));
				}
			}
		}
	}
	void BFSTraversal(HashMap<Integer,ArrayList<Integer>> map) {
		boolean[] visited = new boolean[V];
		System.out.print("BFS Traversal Starting From Minimum Value  :  ");
		for(int i =0 ; i<visited.length; i++) {
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
