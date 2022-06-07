package RECURSION;

import java.util.*;

public class RatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 4;
		int arr[][] = { {1,0,0,0},
						{1,1,0,1},
						{1,1,0,0},
						{0,1,1,1} };
		
		findPathForRat(N, arr);
	}
	static void findPathForRat(int N, int[][] arr){
		
		if(arr[0][0] == 0) {
			System.out.print("Source Value is 0......");
			return ;
		}
		
		ArrayList<String> al = new ArrayList<String>();
		String s = "";
		boolean[][] visited = new boolean[N][N];
		
		dfs(0, 0, N, arr, al, s, visited);
		
		if(al.size() == 0) {
			System.out.print("No path Exist.......");
			
		}else {
			
			for(String st : al) {
				System.out.print(st+"  ");
			}
		}
	}
	static void dfs(int row, int col, int N, int[][] arr, ArrayList<String> al, String s,  boolean[][] visited) {
	
		if(row == N-1 && col == N-1) 
		{
				al.add(s);
				return ;
		}
		if(isSafe(row+1, col, N, arr, visited)) {
			visited[row+1][col]=true;
			dfs(row+1, col, N, arr, al, s+"D", visited ); // for Down
			visited[row+1][col]=false;
			
		}
		if(isSafe(row, col-1, N, arr, visited)) {
			visited[row][col-1]=true;
			dfs(row, col-1, N, arr, al, s+"L", visited ); // for Left
			visited[row][col-1]=false;
			
		}
		if(isSafe(row, col+1, N, arr, visited)) {
			visited[row][col+1]=true;
			dfs(row, col+1, N, arr, al, s+"R", visited ); // for Right
			visited[row][col+1]=false;
			
		}
		if(isSafe(row-1, col, N, arr, visited)) {
			visited[row-1][col]=true;
			dfs(row-1, col, N, arr, al, s+"U", visited ); // for Up
			visited[row-1][col]=false;
			
		}
	}
	static boolean isSafe(int row, int col, int N, int[][] arr, boolean[][] visited) {
		
		if(row<0 || col<0 || row>=N || col>=N) {
			return false;
		}
		if(arr[row][col]==0) {
			return false;
		}
		if(visited[row][col]==true) {
			return false;
		}
		return true;
	}
}
