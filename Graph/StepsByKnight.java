package Graph;

import java.util.*;

class HoldDatas{
	int row;
	int col;
	int count;
	HoldDatas(int r, int c, int count){
		this.row = r;
		this.col = c;
		this.count = count;
	}
}
public class StepsByKnight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = {4,5};
		int[] dest = {1,1};
		int maxRC = Math.max(Math.max(source[0], source[1]), Math.max(dest[0],dest[1]))+1;
		int ans = minStepsByKnight(source,dest,maxRC);
		if(ans == Integer.MAX_VALUE) {
			System.out.print("Invalid Output");
		}else {
			System.out.print("Minimun steps by Knight to reach int the target is : "+ans);
		}
	}
	
	static int minStepsByKnight(int[] source, int[] dest, int maxRC) {
		int[] row = {-2,-1,1,2,-2,-1,1,2};
		int[] col = {-1,-2,-2,-1,1,2,2,1};
		boolean[][] visited = new boolean[maxRC][maxRC];
		
		for(int i=0;i<maxRC;i++) {
			for(int j=0;j<maxRC;j++) {
				visited[i][j]=false;
			}
		}
		
		Queue<HoldDatas> q = new LinkedList<HoldDatas>();
		q.add(new HoldDatas(source[0],source[1],0));
		visited[source[0]] [source[1]] = true;
		
		while(! q.isEmpty()) {
			HoldDatas curr = q.poll();
			if(curr.row == dest[0] && curr.col == dest[1]) {
				return curr.count;
			}
			for(int i=0;i<row.length;i++) {
				int x = curr.row+row[i];
				int y = curr.col+col[i];
				
				if(checkRowCol(x,y,maxRC) && visited[x][y] == false) {
					visited[x][y]=true;
					q.add(new HoldDatas(x,y,curr.count+1));
				}
			}
		}
		return Integer.MAX_VALUE;
	}
	
	private static boolean checkRowCol(int x, int y, int maxRC) {
		if(x<0 || y<0 || x>=maxRC || y>=maxRC) {
			return false;
		}
		return true;
	}
}
