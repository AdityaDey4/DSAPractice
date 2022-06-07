package Graph;
// only Arraylist Implementation 
import java.util.*;
public class Implementation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 4;
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(V);
		for(int i = 0;i<V;i++) {
			al.add(new ArrayList<Integer>());
		}
		Implementation2 ob = new Implementation2();
		ob.addEdge(al,0,1);
		ob.addEdge(al,0,2);
		ob.addEdge(al,0,3);
		ob.addEdge(al,1,3);
		ob.addEdge(al,2,3);
		ob.addEdge(al,3,0);
		ob.addEdge(al,3,1);
		ob.printGraph(al);
		ob.totalVertex(al);
		ob.totalEdge(al);
		ob.hasEdge(al,3,0);
		ob.hasEdge(al,1,2);
		ob.hasVertexPresent(al,6);
		ob.hasVertexPresent(al,3);
	}
	void hasVertexPresent(ArrayList<ArrayList<Integer>> al, int data) {
		boolean res = false ;
		if(data >= 0 && data <= al.size()-1) {
			res = true;
		}
		System.out.println("Is "+data+" present : "+res);
	}
	void hasEdge(ArrayList<ArrayList<Integer>> al , int i, int j) {
		boolean res = al.get(i).contains(j);
		System.out.println("There is Edge between "+i+" & "+j+" : "+res);
	}
	void totalEdge(ArrayList<ArrayList<Integer>> al) {
		int count =0;
		for(int i =0; i< al.size();i++){
			count+=al.get(i).size();
		}
		System.out.println("Total No. of Edge is : "+count);
	}
	void totalVertex(ArrayList<ArrayList<Integer>> al) {
		System.out.println("Total No. of Vertex is : "+al.size());
	}
	void printGraph(ArrayList<ArrayList<Integer>> al) {
		for(int i = 0;i < al.size();i++) {
			System.out.print("Vertex "+i+" : ");
			for(int j =0; j < al.get(i).size();j++) {
				System.out.print(al.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(ArrayList<ArrayList<Integer>> al, int i, int j) {
		al.get(i).add(j);
	}
}
