package DP;
// Recursive Approach
public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		String b = "abdige";
		
		int m = a.length();
		int n = b.length();
		
		System.out.print(getCount(a,b,m,n));
	}
	static int getCount(String a, String b, int m, int n) {
		if(m == 0 || n==0) {
			return 0;
		}
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return 1+getCount(a, b, m-1, n-1);
		}else {
			return Math.max(getCount(a,b,m-1, n), getCount(a,b,m, n-1));
		}
	}
}
