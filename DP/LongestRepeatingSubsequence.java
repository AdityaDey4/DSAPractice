package DP;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aacbc";
		int m = a.length();
		int[][] t = new int[m+1][m+1];
		
		for(int i=0; i<m+1;i++) {
			for(int j=0; j<m+1; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(a.charAt(i-1)==a.charAt(j-1) && i!=j) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		System.out.print(t[m][m]);
	}
}
