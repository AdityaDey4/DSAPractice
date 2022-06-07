package Graph;
import java.util.*;
class Nodes{
	private int edge;
	private int weight;
	Nodes(int edge, int weight){
		this.edge = edge;
		this.weight = weight;
	}
	public int getEdge() {
		return this.edge;
	}
	public int getWeight() {
		return this.weight;
	}
}
public class ShortestPathOfDAG {
	int V;
	LinkedList<Nodes>[] ll;
	ShortestPathOfDAG(int v){
		this.V = v;
		ll = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			ll[i] = new LinkedList<Nodes>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestPathOfDAG ob = new ShortestPathOfDAG(6);
		ob.addEdge(0, 1, 2);
		ob.addEdge(1, 2, 3);
		ob.addEdge(4, 5, 4);
		ob.addEdge(4, 2, 2);
		ob.addEdge(2, 3, 6);
		ob.addEdge(5, 3, 1);
		ob.addEdge(0, 4, -1);
		//ob.printGraph();
		int i = 0;
		System.out.print("Shortest Path of "+i+" is : ");
		ob.shortestPath(i);
	}
	void topologicalSort(boolean[] visited, Stack<Integer> s, int data) {
		visited[data]=true;
		for(Nodes it : ll[data]) {
			if(! visited[it.getEdge()]) {
				topologicalSort(visited,s,it.getEdge());
			}
		}
		s.push(data);
	}
	void shortestPath(int item) {
		boolean[] visited = new boolean[V];
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				topologicalSort(visited,s,i);
			}
		}
		int[] arr = new int[V];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[item]=0;
		while(! s.isEmpty()) {
			int data = s.pop();
			if(arr[data]!=Integer.MAX_VALUE) {
				for(Nodes it : ll[data]) {
					if(arr[it.getEdge()] > it.getWeight()+arr[data]) {
						arr[it.getEdge()] = it.getWeight()+arr[data];
					}
				}
			}
		}
		for(int i=0;i<V;i++) {
			if(arr[i]==Integer.MAX_VALUE) {
				System.out.print("INF ");
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
	void printGraph() {
		for(int i=0;i<ll.length;i++) {
			System.out.print("Vertex "+i+" : ");
			for(Nodes it : ll[i]) {
				System.out.print(it.getEdge()+" , "+it.getWeight()+" -->");
			}
			System.out.println();
		}
	}
	void addEdge(int i, int j, int w) {
		ll[i].add(new Nodes(j,w));
	}
}
