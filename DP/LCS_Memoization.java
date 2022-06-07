package DP;
// DP Memoization approach
public class LCS_Memoization {
	static int[][] t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		String b = "abdige";
		
		int m = a.length();
		int n = b.length();
		t = new int[m+1][n+1];
		getCount(a,b,m,n);
		System.out.print(t[m][n]);
	}
	static int getCount(String a, String b, int m, int n) {
		if(m==0||n==0) {
			return 0;
		}
		if(t[m][n] != 0) {
			return t[m][n];
		}
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return t[m][n] = 1+getCount(a,b,m-1, n-1);
		}
		return Math.max(getCount(a,b,m-1,n), getCount(a,b,m,n-1));
	}
}
