package DP;

public class EvaluateExpression_Memoization2 {
	
	//true means 1 & false means 0
	
	static int t[][][] = new int[2][1001][1001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "T^F&T";
		boolean evaluate = true;
		int value = evaluate?1:0;
		for(int i=0; i<t.length; i++) {
			for(int j=0; j<t[i].length; j++) {
				for(int k=0; k<t[i][j].length; k++) {
					t[i][j][k] = -1;
				}
			}
		}
		System.out.print(solve(s, 0, s.length()-1, value));
	}
	static int solve(String s, int i, int j, int needed) {
		if(i>j) {
			return 0;
		}
		if(i==j) {
			if(needed==1) {
				return s.charAt(i)=='T'?1:0;
			}else {
				return s.charAt(i)=='F'?1:0;
			}
		}
		if(t[needed][i][j] != -1) {
			return t[needed][i][j];
		}
		int ans = 0;
		for(int k=i+1;k<j;k++) {
			int lt = solve(s,i,k-1,1);
			int lf = solve(s,i,k-1,0);
			int rt = solve(s,k+1,j,1);
			int rf = solve(s,k+1,j,0);
			
			if(s.charAt(k)=='^') {
				if(needed==1) {
					ans += lt*rf+lf*rt;
				}else {
					ans += lt*rt+lf*rf;
				}
			}
			else if(s.charAt(k) == '&') {
				if(needed==1) {
					ans+= lt*rt;
				}else {
					ans+= lf*rf+lt*rt+lf*rt;
				}
			}
			else if(s.charAt(k)=='|') {
				if(needed==1) {
					ans+= lt*rt+lf*rt+lt*rt;
				}
			}
		}
		return ans;
	}
}
