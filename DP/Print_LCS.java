package DP;

public class Print_LCS {
	public static void main(String args[]) {
		String a = "aggtab";
		String b = "gxtxayb";
		
		int m = a.length();
		int n = b.length();
		
		int t[][] = new int[n+1][m+1];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=m; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(b.charAt(i-1)==a.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		StringBuilder s = new StringBuilder();
		while(m!=0 && n!=0) {//both value are same
			if(a.charAt(m-1) == b.charAt(n-1)) {
				s.append(a.charAt(m-1));
				n--;
				m--;
			}else {// move to the max neighbor
				if(t[n-1][m]> t[n][m-1]) {
					n--;
				}else {
					m--;
				}
			}
		}
		s.reverse();
		String ans = s.toString();
		System.out.print(ans);
	}
}
