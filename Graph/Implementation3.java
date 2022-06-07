package Graph;
// HashMap Implementation
import java.util.*;
public class Implementation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation3 ob = new Implementation3();
		int[] arr = {10,15,20,30,50};
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], new ArrayList<Integer>());
		}
		ob.addEdge(map,arr[0],arr[1]);
		ob.addEdge(map,arr[0],arr[2]);
		ob.addEdge(map,arr[1],arr[2]);
		ob.addEdge(map,arr[1],arr[3]);
		ob.addEdge(map,arr[2],arr[0]);
		ob.addEdge(map,arr[3],arr[2]);
		ob.addEdge(map,arr[4],arr[1]);
		ob.addEdge(map,arr[4],arr[3]);
		ob.printGraph(map,arr);
		ob.totalVertex(map);
		ob.totalEdge(map,arr);
		ob.hasEdge(map,arr[1],arr[2]);
		ob.hasEdge(map,arr[3],arr[4]);
		ob.hasVertexPresent(map,60);
		ob.hasVertexPresent(map,30);
	}
	void totalVertex(HashMap<Integer,ArrayList<Integer>> map) {
		System.out.println("Total No. of Vertex is : "+map.size());
	}
	void totalEdge(HashMap<Integer,ArrayList<Integer>> map, int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count+=map.get(arr[i]).size();
		}
		System.out.println("Total No. of Edge is : "+count);
	}
	void hasVertexPresent(HashMap<Integer,ArrayList<Integer>> map, int data) {
		boolean res = map.containsKey(data);
		System.out.println("Is "+data+" present : "+res);
	}
	void hasEdge(HashMap<Integer,ArrayList<Integer>> map, int i, int j) {
		boolean res = map.get(i).contains(j);
		System.out.println("There is Edge between "+i+" & "+j+" : "+res);
	}
	void printGraph(HashMap<Integer,ArrayList<Integer>> map,int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("Vertex "+arr[i]+" : ");
			ArrayList<Integer> al = map.get(arr[i]);
			for(int j=0;j<al.size();j++) {
				System.out.print(al.get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(HashMap<Integer,ArrayList<Integer>> map, int i, int j) {
		map.get(i).add(j);
	}
}
