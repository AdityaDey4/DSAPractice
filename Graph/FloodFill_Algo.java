package Graph;

public class FloodFill_Algo {
	int ROW;
	int COL;
	public static void main(String[] args) {
		FloodFill_Algo ob = new FloodFill_Algo();
		// TODO Auto-generated method stub
		int[][] arr =  {{0,2,1,3,3},
						{3,4,0,2,3},
						{1,1,3,4,4},
						{1,1,2,2,2},
						{1,0,1,0,1} };
		ob.ROW = arr.length;
		ob.COL = arr[0].length;
		System.out.println("Before using FloodFil Algorithm : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int r=0,c=0,data=10;
		ob.floodFillAlgorithm(arr,r,c,data,arr[r][c]);
		
		r=2;
		c=1;
		data=5;
		ob.floodFillAlgorithm(arr,r,c,data,arr[r][c]);
		
		r=3;
		c=2;
		data=6;
		ob.floodFillAlgorithm(arr,r,c,data,arr[r][c]);
		
		r=2;
		c=3;
		data=8;
		ob.floodFillAlgorithm(arr,r,c,data,arr[r][c]);
		
		r=1;
		c=4;
		data=7;
		ob.floodFillAlgorithm(arr,r,c,data,arr[r][c]);
		
		System.out.println("After using FloodFil Algorithm : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	void floodFillAlgorithm(int[][] arr, int r, int c, int data,int prev) {
		if(c<0 || r<0 || r>ROW-1 || c>COL-1) {
			return;
		}
		if(arr[r][c]==prev) {
			arr[r][c]=data;
			floodFillAlgorithm(arr,r+1,c,data,prev);
			floodFillAlgorithm(arr,r-1,c,data,prev);
			floodFillAlgorithm(arr,r,c+1,data,prev);
			floodFillAlgorithm(arr,r,c-1,data,prev);
		}
	}
}
