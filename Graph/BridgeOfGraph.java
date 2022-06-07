package Graph;

import java.util.*;

public class BridgeOfGraph {
	int V;
	LinkedList<Integer>[] ll;
	int timer=0;
	BridgeOfGraph(int v){
		this.V = v;
		ll = new LinkedList[v];
		for(int i=0;i<V;i++) {
			ll[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int i, int j) {
		ll[i].add(j);
		ll[j].add(i);
	}
	
	void findBridge() {
		int[] time = new int[V];
		int[] low = new int[V];
		
		Arrays.fill(time, -1);
		
		for(int i=0;i<time.length;i++) {
			if(time[i]==-1) {
				dfs(i,time,low,-1);
			}
		}
	}
	
	void dfs(int i, int[] time, int[] low, int parent) {
		time[i]=low[i]=timer++;
		for(Integer it : ll[i]) {
			if(it==parent) {
				continue;
			}
			
			else if(time[it]==-1) {
				dfs(it,time,low,i);
				low[i]=Math.min(low[it], low[i]);
				if(low[it]>time[i]) {
					System.out.println(i+"-->"+it);
				}
			}
			
			else {
				low[i]=Math.min(time[it], low[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BridgeOfGraph ob = new BridgeOfGraph(5);
		ob.addEdge(0, 1);
		ob.addEdge(0, 2);
		ob.addEdge(1, 2);
		ob.addEdge(1, 3);
		ob.addEdge(3, 4);
		ob.findBridge();
	}

}
