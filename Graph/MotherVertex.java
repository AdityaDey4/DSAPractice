package Graph;

import java.util.*;

public class MotherVertex {
	int V;
	HashMap<Integer,ArrayList<Integer>> map;
	MotherVertex(int v){
		this.V = v;
		map = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			map.put(i, new ArrayList<Integer>());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotherVertex ob = new MotherVertex(5);
		ob.addEdge(0, 2);
		ob.addEdge(0, 3);
		ob.addEdge(1, 0);
		ob.addEdge(2, 1);
		ob.addEdge(3, 4);
		ob.printGraph();
		ob.findMotherVertex();
	}
	boolean isMotherVertex(HashSet<Integer> set, int data) {
		if(set.contains(data)) {
			return true;
		}
		set.add(data);
		for(int i=0;i<map.get(data).size();i++) {
			isMotherVertex(set,map.get(data).get(i));
		}
		if(set.size() == V) {
			return true;
		}
		return false;
	}
	void findMotherVertex() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean res ;
		for(int i =0; i<V;i++) {
			HashSet<Integer> set = new HashSet();
			res = isMotherVertex(set,i);
			if(res == true) {
				al.add(i);
			}
		}
		System.out.print("Mother Vertex of the Graph : ");
		System.out.print(al);
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
