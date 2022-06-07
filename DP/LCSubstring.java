package DP;

public class LCSubstring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		String b = "abdge";
		
		int m = a.length();
		int n = b.length();
		
		int[][] t = new int[m+1][n+1];
		int ans = 0;
		
		
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0||j==0) {
					t[i][j] = 0;
				}
				else if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
					ans = Math.max(ans, t[i][j]);
				}
				else {
					t[i][j] = 0;
				}
			}
		}
		System.out.print(ans);
	}

}
