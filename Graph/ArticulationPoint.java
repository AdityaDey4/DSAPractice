package Graph;

import java.util.*;

public class ArticulationPoint {
	int V;
	LinkedList<Integer>[] ll;
	ArticulationPoint(int v){
		this.V = v;
		ll = new LinkedList[V];
		
		for(int i=0;i<V;i++) {
			ll[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int i, int j) {
		ll[i].add(j);
		ll[j].add(i);
	}
	
	void findArticulationPoint(int source) {
		
		boolean[] isAp = new boolean[V];
		int[] time = new int[V];
		int[] low = new int[V];
		
		for(int i=0;i<V;i++) {
			isAp[i]=false;
			time[i]=-1;
		}
		int timer=0;
		for(int i=0;i<V;i++) {
			if(time[i]==-1) {
				dfs(i,isAp,time,low,-1,timer);
			}
		}
		for(int i=0;i<V;i++) {
			if(isAp[i]==true) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	void dfs(int index, boolean[] isAp, int[] time, int[] low, int parent, int timer) {
		int child = 0;
		time[index]=low[index]=timer++;
		
		for(int it: ll[index]) {
			
			if(time[it] == -1) {
				child++;
				dfs(it,isAp,time,low,index,timer);
				low[index]=Math.min(low[index], low[it]);
				
				if(parent != -1 && low[it] >= time[index]) {
					isAp[index]=true;
				}
			}
			else if(it != parent) {
				low[index]=Math.min(low[index], time[it]);
			}
		}
		if(parent == -1 && child>1) {
			isAp[index]=true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArticulationPoint ob = new ArticulationPoint(5);
		
		ob.addEdge(0, 1);
		ob.addEdge(0, 2);
		ob.addEdge(1, 2);
		ob.addEdge(1, 3);
		ob.addEdge(3, 4);
		
		ob.findArticulationPoint(0);
	}

}
