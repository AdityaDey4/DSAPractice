package Graph;
// Array of Linked List (Adjancency List)
import java.util.*;
public class Implementation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 4;
		LinkedList<Integer>[] al = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			al[i] = new LinkedList();
		}
		Implementation4 ob = new Implementation4();
		ob.addEdge(al,0,1);
		ob.addEdge(al,0,2);
		ob.addEdge(al,0,3);
		ob.addEdge(al,1,3);
		ob.addEdge(al,2,3);
		ob.addEdge(al,3,0);
		ob.addEdge(al,3,1);
		ob.printGraph(al);
	}
	void printGraph(LinkedList<Integer> al[]) {
		for(int i = 0; i< al.length; i++) {
			System.out.print("Vertex "+i+" : ");
			for(int j =0; j < al[i].size();j++) {
				System.out.print(al[i].get(j)+" ");
			}
			System.out.println();
		}
	}
	void addEdge(LinkedList<Integer> al[], int i, int j) {
		al[i].add(j);
	}
	
}
