package Graph;

import java.util.*;

public class PathsBtwTwoNodes {
	int V;
	HashMap<Integer,ArrayList<Integer>> map;
	PathsBtwTwoNodes(int v){
		map = new HashMap<Integer,ArrayList<Integer>>();
		this.V = v;
		for(int i =0; i<V ;i++) {
			map.put(i, new ArrayList<Integer>());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathsBtwTwoNodes ob = new PathsBtwTwoNodes(6);
		ob.addEdge(0, 5);
		ob.addEdge(1, 0);
		ob.addEdge(1, 5);
		ob.addEdge(2, 0);
		ob.addEdge(5, 1);
		ob.addEdge(3, 2);
		ob.addEdge(4, 1);
		ob.addEdge(4, 3);
		ob.addEdge(4, 5);
		//ob.printGraph();
		int s = 4;
		int d = 0;
		ob.printPaths(s,d);
	}
	void print(int s, int d, boolean[] visited, ArrayList<Integer> al) {
		if(visited[s] == true) {
			return ;
		}
		visited[s] = true;
		al.add(s);
		if(s==d) {
			System.out.println(al);
			visited[s]= false;
			return;
		}
		for(int i = 0; i < map.get(s).size(); i++) {
			print(map.get(s).get(i), d, visited, al);
			al.remove(map.get(s).get(i));
			if(s==d) {
				break;
			}
		}
		visited[s]= false;
	}
	void printPaths(int s, int d) {
		boolean[] visited = new boolean[V];
		ArrayList<Integer> al = new ArrayList<Integer>();
		print(s,d,visited,al);
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
