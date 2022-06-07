package Graph;

import java.util.*;
class Node5 implements Comparator<Node5> {
	int source;
	int dest;
	int weight;
	Node5(){}
	Node5(int s, int d, int w){
		this.source =s;
		this.dest =d;
		this.weight =w;
	}
	@Override
	public int compare(Node5 o1, Node5 o2) {
		// TODO Auto-generated method stub
		if(o1.weight > o2.weight) {
			return 1;
		}
		if(o1.weight < o2.weight) {
			return -1;
		}
		return 0;
	}
}
public class Kruskals_Algo {
	int V;
	Kruskals_Algo(int v){
		this.V=v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kruskals_Algo ob = new Kruskals_Algo(6);
		PriorityQueue<Node5> pq = new PriorityQueue<Node5>(new Node5());
		pq.add(new Node5(0, 1, 1));
		pq.add(new Node5(0, 2, 2));
		pq.add(new Node5(1, 2, 3));
		pq.add(new Node5(1, 4, 7));
		pq.add(new Node5(2, 4, 5));
		pq.add(new Node5(2, 3, 3));
		pq.add(new Node5(4, 5, 6));
		pq.add(new Node5(4, 3, 2));
		pq.add(new Node5(3, 5, 4));
		ob.minimumSpanningTree(pq);
	}
	int findPar(int[] parent,int data) {
		if(parent[data]==data) {
			return parent[data];
		}
		return parent[data]=findPar(parent,parent[data]);
	}
	void union(int[] parent, int[] rank, int a, int b) {
		a=findPar(parent,a);
		b=findPar(parent,b);
		if(rank[a]>rank[b]) {
			parent[b]=a;
		}
		else if(rank[b]>rank[a]) {
			parent[a]=b;
		}
		else {
			parent[b]=a;
			rank[b]++;
		}
	}
	void minimumSpanningTree(PriorityQueue<Node5> pq) {
		
		int key[] = new int[V];
		int parent[] = new int[V];
		for(int i=0;i<V;i++) {
			parent[i]=i;
			key[i]=0;
		}
		ArrayList<Node5> al = new ArrayList<Node5>();
		int sum=0;
		while(! pq.isEmpty()) {
			Node5 curr = pq.poll();
			if(findPar(parent,curr.source) != findPar(parent,curr.dest)) {
				sum+=curr.weight;
				al.add(curr);
				union(parent,key,curr.dest,curr.source);
			}
		}
		for(Node5 it : al) {
			System.out.println(it.source+" , "+it.dest+" --> "+it.weight);
		}
		System.out.print("Total weight of minimum spanning tree is : "+sum);
	}
}
