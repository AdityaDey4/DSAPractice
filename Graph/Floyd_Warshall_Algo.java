package Graph;

public class Floyd_Warshall_Algo {
	static int INF = 99999;
	static int V =4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {	{0,3,INF,7},
						{8,0,2,INF},
						{5,INF,0,1},
						{2,INF,INF,0}	};
		shortestPath(arr);
	}
	static void shortestPath(int[][] arr) {
		for(int k=0;k<V;k++) {
			for(int i=0;i<V;i++) {
				for(int j=0;j<V;j++) {
					if(arr[i][j] > arr[i][k]+arr[k][j]) {
						arr[i][j] = arr[i][k]+arr[k][j];
					}
				}
			}//DIRECT AND UNDIRECT GRAPH BOTH APPLICABLE
		}//BUT THE WEIGHTS OF EDGES SHOULD BE POSITIVE
		for(int i=0;i<V;i++) {
			System.out.print("Shortest Path From "+i+" : ");
			for(int j=0;j<V;j++) {
				if(arr[i][j] == INF) {
					System.out.print("INF ");
				}else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}