package Graph;
import java.util.*;
class Orange{
	int data;
	int row;
	int column;
	Orange(int d, int r, int c){
		this.data=d;
		this.column=c;
		this.row=r;
	}
}
public class Rotten_Oranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotten_Oranges ob = new Rotten_Oranges();
		int[][] arr = { {2,0,1,2},
						{1,0,0,2},
						{1,0,0,1} };
		int ans = ob.minTimeToRot(arr);
		System.out.print(ans);
	}
	void addQueue(int i, int j, int[][] arr, Queue<Orange> q, Orange curr, boolean[][] visited) {
		if(i<0 || j<0 || i>arr.length-1 || j>arr[i].length-1) {
			return;
		}
		else if(visited[i][j]==true) {
			return;
		}
		else if(arr[i][j]==1){
			visited[i][j]=true;
			arr[i][j]=2;
			q.add(new Orange((curr.data+1),i,j));
		}
	}

	int minTimeToRot(int[][] arr) {
		Queue<Orange> q = new LinkedList<Orange>();
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				visited[i][j]=false;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==2) {
					visited[i][j]=true;
					q.add(new Orange(0,i,j));
				}
			}
		}
		int ans=0;
		
		while(! q.isEmpty()) {
			Orange curr = q.poll();
			ans = curr.data;
			addQueue(curr.row+1,curr.column,arr,q,curr,visited);
			addQueue(curr.row,curr.column+1,arr,q,curr,visited);
			addQueue(curr.row-1,curr.column,arr,q,curr,visited);
			addQueue(curr.row,curr.column-1,arr,q,curr,visited);
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					return -1;
				}
			}
		}
		return ans;
	}
}
