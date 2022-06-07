package Graph;
import java.util.*;
class Answer{
	int ans=Integer.MAX_VALUE;
	TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
}
public class ShortestPath_UnWeightedGraph {
	int V;
	LinkedList<Integer>[] ll;
	ShortestPath_UnWeightedGraph(int v){
		this.V = v;
		ll = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			ll[i] = new LinkedList<Integer>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestPath_UnWeightedGraph ob = new ShortestPath_UnWeightedGraph(6);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(3, 5);
		ob.addEdge(4, 5);
		ob.addEdge(2, 3);
		ob.addEdge(2, 4);
		ob.addEdge(3, 4);
		//ob.printGraph();
		int s=1;
		int d=4;
		ob.shortestPath(s,d);
	}
	void DFS(boolean[] visited, ArrayList<Integer> al, Answer ob, int data, int s, int d) {
		visited[data]=true;
		al.add(data);
		if(data==d) {
			ob.map.put(al.size(), new ArrayList<Integer>(al));
			ob.ans = Math.min(ob.ans, al.size());
			visited[data]=false;
			return;
		}
		for(Integer it : ll[data]) {
			if(visited[it]==false) {
				DFS(visited,al,ob,it,s,d);
				al.remove(it);
			}
		}
		visited[data]=false;
	}
	void shortestPath(int s, int d) {
		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);
		ArrayList<Integer> al = new ArrayList<Integer>();
		Answer ob = new Answer();
		DFS(visited,al,ob,s,s,d);

		System.out.print(ob.map.get(ob.ans));	
	}
	void printGraph() {
		for(int i=0;i<ll.length;i++) {
			System.out.print("Vertex "+i+" : ");
			for(int j=0;j<ll[i].size();j++) {
				System.out.print(ll[i].get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(int i, int j) {
		ll[i].add(j);
		ll[j].add(i);
	}
}
