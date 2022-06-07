package Searching_Sorting;

import java.util.*;
 

class Node implements Comparator<Node>
{
    private int v;
    private int weight;
    
    Node(int _v, int _w) { v = _v; weight = _w; }
    
    Node() {}
    
    int getV() { return this.v; }
    int getWeight() { return this.weight; }
    
    @Override
    public int compare(Node node1, Node node2) 
    { 
        if (node1.weight < node2.weight) 
            return -1; 
        if (node1.weight > node2.weight) 
            return 1; 
        return 0; 
    } 
}

class Raf
{
	int V;
	LinkedList<Node>[] adj;
	Raf(int v){
		this.V = v;
		adj = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			adj[i] = new LinkedList<Node>();
		}
	}
    void shortestPath(int s)
    {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0; 
        
        PriorityQueue<Node> pq = new PriorityQueue<Node>(V, new Node());
        pq.add(new Node(s, 0));
        
        while(! pq.isEmpty()) {
            Node node = pq.poll();
            
            for(Node it: adj[node.getV()]) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight(); 
                    pq.add(new Node(it.getV(), dist[it.getV()]));
                }
            }
        }
        
        for(int i=0;i<V;i++) {
			if(dist[i] == Integer.MAX_VALUE) {
				System.out.print("INF ");
			}else {
				System.out.print(dist[i]+" ");
			}
		}
    }
    public static void main(String args[])
    {
		Raf ob = new Raf(5); 
		ob.addEdge(0, 1, 2);
		ob.addEdge(1, 2, 4);
		//ob.addEdge(3, 4, -2);
		ob.addEdge(3, 2, 3);
		ob.addEdge(2, 4, 3);
		ob.addEdge(2, 4, 1);
		ob.addEdge(1, 4, 5);
		ob.shortestPath(1); 
		
		
			 
		 }
		
    }
    void addEdge(int i, int j, int w) {
		adj[i].add(new Node(j,w));
		adj[j].add(new Node(i,w));
	}
}