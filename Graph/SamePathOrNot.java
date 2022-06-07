package Graph;

import java.util.*;

public class SamePathOrNot {
	int V;
	HashMap<Integer,ArrayList<Integer>> map;
	SamePathOrNot(int v){
		map = new HashMap<Integer,ArrayList<Integer>>();
		this.V = v;
		for(int i =0; i<V ;i++) {
			map.put(i, new ArrayList<Integer>());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePathOrNot ob = new SamePathOrNot(8);
		ob.addEdge(4, 7);
		ob.addEdge(1, 2);
		ob.addEdge(1, 3);
		ob.addEdge(1, 4);
		ob.addEdge(2, 5);
		ob.addEdge(3, 6);
		ob.printGraph();
		int i =2;
		int j =6;
		System.out.print("is "+i+" & "+j+" is in same path ? ----> ");
		ob.isSamePath(i, j);
		ob.isSamePath(j, 1);
	}
	void isSamePath(int data1, int data2) {
		if(data1 == data2) {
			System.out.print(true);
			System.exit(0);
		}
		for(int i=0 ; i<map.get(data1).size(); i++) {
			isSamePath(map.get(data1).get(i),data2);
		}
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
