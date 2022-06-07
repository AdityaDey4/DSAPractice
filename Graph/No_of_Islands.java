package Graph;

public class No_of_Islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1,1,0,0,0},
						{0,1,0,0,1},
						{1,0,0,1,1},
						{0,0,0,0,0},
						{1,0,1,0,1} };
		System.out.print("No of Islands is : "+findNoOfIslands(arr));
	}
	static void dfs(int i, int j, int row, int col, boolean[][] visited, int[][] arr) {
		if(i<0 || j<0 || i>=row || j>=col) {
			return ;
		}
		if(visited[i][j]==false) {
			return;
		}
		if(arr[i][j] != 0) {
			visited[i][j]=false;
			dfs(i-1,j,row,col,visited,arr);
			dfs(i+1,j,row,col,visited,arr);
			dfs(i,j-1,row,col,visited,arr);
			dfs(i,j+1,row,col,visited,arr);
			dfs(i+1,j+1,row,col,visited,arr);
			dfs(i+1,j-1,row,col,visited,arr);
			dfs(i-1,j-1,row,col,visited,arr);
			dfs(i-1,j+1,row,col,visited,arr);
		}
	}
	static int findNoOfIslands(int[][] arr) {
		int row = arr.length;
		boolean[][] visited = new boolean[row][10];
		for(int i=0;i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					visited[i][j]=true;
				}
			}
		}
		int count=0;
		for(int i=0;i<row;i++) {
			int col=arr[i].length;
			for(int j=0;j<col;j++) {
				if(visited[i][j]==true) {
					dfs(i,j,row,col,visited,arr);
					count++;
				}
			}
		}
		return count;
	}
}
