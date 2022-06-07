package DP;

public class DeleteForPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "agbcba";
		String b = reverse(a);
		
		int m = a.length();
		int n = b.length();
		int[][] t = new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		
		System.out.println("Number of Deletion to make Longest Palindromic Subsequence : "+(a.length()-t[m][n]));
	}
	static String reverse(String a) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<a.length(); i++) {
			s.append(a.charAt(i));
		}
		s.reverse();
		return s.toString();
	}
}
