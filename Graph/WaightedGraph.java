package Graph;

import java.util.*;
class Node{
	int edge;
	int weight;
	Node(int edge, int weight){
		this.edge = edge;
		this.weight = weight;
	}
}
public class WaightedGraph {
	int V;
	LinkedList<Node>[] ll;
	WaightedGraph(int v){
		this.V = v;
		ll = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			ll[i] = new LinkedList<Node>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaightedGraph ob = new WaightedGraph(6);
		ob.addEdge(0, 1, 2);
		ob.addEdge(1, 2, 3);
		ob.addEdge(4, 5, 4);
		ob.addEdge(4, 2, 2);
		ob.addEdge(2, 3, 6);
		ob.addEdge(5, 3, 1);
		ob.addEdge(0, 4, -1);
		ob.printGraph();
	}
	void printGraph() {
		for(int i=0;i<ll.length;i++) {
			System.out.print("Vertex "+i+" : ");
			for(Node it : ll[i]) {
				System.out.print(it.edge+" , "+it.weight+" -->");
			}
			System.out.println();
		}
	}
	void addEdge(int i, int j, int w) {
		ll[i].add(new Node(j,w));
	}
}
