package Graph;
import java.util.*;
public class HamiltonianPath {
	int V;
	ArrayList<Integer> path;
	int source;
	boolean isCycle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {0,1,0,0,0,1},
						{1,0,1,0,0,0},
						{0,1,0,1,0,1},
						{0,0,1,0,1,0},
						{0,0,0,1,0,1},
						{1,0,1,0,1,0} };
		HamiltonianPath ob = new HamiltonianPath();
		ob.printHamiltonianPaths(arr);
	}
	void printHamiltonianPaths(int arr[][]) {
		this.V = arr.length;
		path = new ArrayList<Integer>();
		boolean[] visited = new boolean[V];
		this.source= 0;
		
		//visited[source]=true;
		//path.add(source);
		//getHamiltonianPaths(source,visited,arr); //all hamiltonian paths that starts from index 0
		// if we want to show hamiltonial paths from all index then we can by iterating all the elements through loops
		for(int i=0; i<V; i++) {
			visited[i]=true;
			path.add(i);
			getHamiltonianPaths(i,visited,arr);
			visited[i]=false;
			path.remove(path.size()-1);
		}
		if(this.isCycle == false) {
			System.out.println("Hamiltonian Paths does not exist............");
		}
	}
	void getHamiltonianPaths(int pos, boolean[] visited, int[][] arr) {
		if(path.size() == V) {
			this.isCycle = true;
			displayPath();
			return;
		}
		for(int i=0; i<V; i++) {
			if(arr[pos][i]==1 && visited[i] == false) {
				visited[i]=true;
				path.add(i);
				getHamiltonianPaths(i,visited,arr);
				visited[i]=false;
				path.remove(path.size()-1);
			}
		}
	}
	void displayPath() {
		for(Integer it : path) {
			System.out.print(it+" ");
		}
		System.out.println();
	}
}
