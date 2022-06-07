package RECURSION;

public class N_Queens_Problem {

	public static void main(String[] args) {
		int N=4;
		int[][] arr = new int[N][N];
        for(int i = 0; i < N; i++)
        {
        	for(int j = 0; j < N; j++)
        	{
        		arr[i][j] = 0;
        	}
        }
 
        solveQueenProblem(0, arr,N);
	}
	static void printArray(int[][] arr, int N) {
			
		for(int i=0;i<N;i++) {
			for(int j=0; j<N ; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
    static void solveQueenProblem(int col, int[][] arr, int N) {
        if(col >= N) {
            printArray(arr,N);
            System.out.println();
            return;
        }     
        for(int row = 0; row < N; row++) {
        	
            if(isSafe(row, col,arr)) {  	
                arr[row][col] = 1;
                solveQueenProblem(col+1, arr, N);
                arr[row][col] = 0;
            }
        }
    }
    static boolean isSafe(int row, int col, int[][] arr) {
        /*
          we have to check (row,col-1)-> left , (row-1,col-1)-> upper diagonal & (row+1,col-1)-> lower diagonal
          if there is queen or 1 avaiable the it returns false or else it returns true
        */
    	for(int i=row, j=col; i>=0 && j>=0; i--,j--) { // check (row-1, col-1)
    		if(arr[i][j]==1) {
    			return false;
    		}
    	}
    	
    	for(int j=col; j>=0; j--) {
    		if(arr[row][j]==1) {
    			return false;
    		}
    	}
        return true; 
    }
}
