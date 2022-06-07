package Graph;
// Matrix Implementation //
public class Implementation1 {
	int V = 4; // 0,1,2,3 //
	int[][] arr = new int[V][V];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation1 ob = new Implementation1();
		ob.addEdge(0,1);
		ob.addEdge(0,2);
		ob.addEdge(0,3);
		ob.addEdge(1,3);
		ob.addEdge(2,3);
		ob.addEdge(3,0);
		ob.addEdge(3,1);
		ob.printGraph();
		ob.totalVertex();
		ob.totalEdge();
		ob.hasEdge(3,0);
		ob.hasEdge(1,2);
		ob.hasVertexPresent(6);
		ob.hasVertexPresent(3);
	}
	void hasVertexPresent(int data) {
		boolean res = false;
		if(data >= 0 && data <= arr.length-1) {
			res = true;
		}
		System.out.println("Is "+data+" present : "+res);
	}
	void hasEdge(int i, int j) {
		boolean res = false;
		if(arr[i][j] == 1) {
			res = true;
		}
		System.out.println("There is Edge between "+i+" & "+j+" : "+res);
	}
	void totalEdge() {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println("Total No. of Edge is : "+count);
	}
	void totalVertex() {
		System.out.println("Total No. of Vertex is : "+arr.length);
	}
	void printGraph() {
		for(int i = 0; i<arr.length; i++) {
			System.out.print("Vertex "+i+" : ");
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j] == 1) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
	void addEdge(int i, int j) {
		arr[i][j] = 1;
	}
}
