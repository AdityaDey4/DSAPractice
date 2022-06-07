package RECURSION;

public class SudokuProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] { 	{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
						                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
						                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
						                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
						                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
						                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
						                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
						                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
						                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 	};
		int N = arr.length;
		
		solveSudoku(arr,N);
		printArray(arr,N);
	}
	static void printArray(int[][] arr, int N) {
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static boolean solveSudoku(int[][] arr, int N) {
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]==0) { // there is null value
					
					for(int index=1;index<10;index++) { // checking all the indexes from 1 to 9
						
						if(isValid(arr,index,i,j,N)) { // checking all the individual indexes valid or not
							
							arr[i][j]=index;
							
							if(solveSudoku(arr,N)) {
								
								return true; // true -> there is no null or 0 element
							}else {
								arr[i][j]=0; // false -> the specific index is not valid
							}
						}
					}
					return false; // if 1 to 9 none of index is not possible then return false
				}
			}
		}
		return true; // there is no 0's & Array is full
	}
	static boolean isValid(int[][] arr, int index, int row, int col, int N) {
		
		for(int i=0;i<N;i++) {
			
			if(arr[i][col]==index) {return false;} // check column
			if(arr[row][i]==index) {return false;} // check row
			
			if(arr[3*(row/3)+i/3][3*(col/3)+i%3]==index) {return false;} // check 3*3 matrix
		}
		return true;
	}
}
