package Graph;

import java.util.*;

public class Tarjans_Algo {
	int V;
	int time;
	Tarjans_Algo(int v){
		this.V=v;
		this.time=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v =8;
		Tarjans_Algo ob = new Tarjans_Algo(v);
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<v;i++) {
			al.add(new ArrayList<Integer>());
		}
		ob.addEdge(al, 0, 1);
		ob.addEdge(al, 1, 2);
		ob.addEdge(al, 2, 3);
		ob.addEdge(al, 3, 0);
		ob.addEdge(al, 1, 4);
		ob.addEdge(al, 4, 5);
		ob.addEdge(al, 5, 6);
		ob.addEdge(al, 6, 4);
		ob.addEdge(al, 5, 7);
		ob.tarjansAlgorithm(al);
	}
	void dfs(int data, int[] low, int[] high, boolean[] visited, Stack<Integer> s, ArrayList<ArrayList<Integer>> al) {
		visited[data]=true;
		low[data]=time;
		high[data]=time;
		time++;
		s.add(data);
		for(Integer it : al.get(data)) {
			if(visited[it]==false) {
				dfs(it,low,high,visited,s,al);
				high[data]=Math.min(high[it], high[data]);
			}
			else {
				high[data]=Math.min(high[it], high[data]);
			}
		}
		int curr =-1;
		if(low[data]==high[data]) {
			while(curr!=data) {
				curr=s.pop();
				System.out.print(curr+" ");
			}
			System.out.println();
		}
	}
	void tarjansAlgorithm(ArrayList<ArrayList<Integer>> al) {
		int[] low = new int[V];
		int[] high = new int[V];
		boolean[] visited = new boolean[V];
		Stack<Integer> s = new Stack<Integer>();
		
		Arrays.fill(visited, false);
		Arrays.fill(high, -1);
		Arrays.fill(low, -1);
		
		for(int i=0;i<V;i++) {
			if(low[i]==-1) {
				dfs(i,low,high,visited,s,al);
			}
		}
	}
	void addEdge(ArrayList<ArrayList<Integer>> al, int i, int j) {
		al.get(i).add(j);
	}
}
