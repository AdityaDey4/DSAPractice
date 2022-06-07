package Graph;


public class Raf {

	int N ;
	  
    /* A utility function to print solution */
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }
  
    boolean isSafe(int arr[][], int row, int col)
    {
    	for(int i=row, j=col; i>=0 && j>=0; i--,j--) { // check (row-1, col-1)
    		if(arr[i][j]==1) {
    			return false;
    		}
    	}
    	
    	for(int i=row, j=col; i<arr.length && j>=0; i++,j--) {
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
  
    /* A recursive utility function to solve N
       Queen problem */
    boolean solveQueenProblem(int[][] arr, int col) {
    	if (col >= N)
            return true;
  
        /* Consider this column and try placing
           this queen in all rows one by one */
        for (int row = 0; row < N; row++) {
           
            if (isSafe(arr, row, col)) {
               
                arr[row][col] = 1;
                if (solveQueenProblem( arr, col+1) == true)
                    return true;
  
                arr[row][col] = 0; // BACKTRACK
            }
        }
  
        return false;
    }
  
 
    boolean solveNQ()
    {
    	this.N=4;
		int[][] board = new int[N][N];
        for(int i = 0; i < N; i++)
        {
        	for(int j = 0; j < N; j++)
        	{
        		board[i][j] = 0;
        	}
        }
  
        if (solveQueenProblem(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }
  
        printSolution(board);
        return true;
    }
  
    // driver program to test above function
    public static void main(String args[])
    {
        Raf Queen = new Raf();
        Queen.solveNQ();
    }
}

