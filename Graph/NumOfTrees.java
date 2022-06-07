package Graph;
import java.util.*;
public class NumOfTrees {
	int V;
	HashMap<Integer,ArrayList<Integer>> map;
	NumOfTrees(int v){
		map = new HashMap<Integer,ArrayList<Integer>>();
		this.V = v;
		for(int i =0; i<V ;i++) {
			map.put(i, new ArrayList<Integer>());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumOfTrees ob = new NumOfTrees(6);
		ob.addEdge(1, 4);
		ob.addEdge(0, 2);
		ob.addEdge(0, 3);
		ob.addEdge(0, 4);
		ob.addEdge(2, 0);
		ob.addEdge(3, 2);
		ob.printGraph();
		ob.totalTrees();
	}
	void DFS(boolean[] visited, int data) {
		if(visited[data] == true) {
			return ;
		}
		visited[data] = true;
		for(int i=0 ; i<map.get(data).size(); i++) {
			DFS(visited,map.get(data).get(i));
		}
	}
	void totalTrees() {
		boolean[] visited = new boolean[V];
		int res =0;
		for(int i =0; i< V; i++) {
			if(visited[i] == false) {
				DFS(visited,i);
				res++;
			}
		}
		System.out.print("Total No. of Tress : "+res);
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
