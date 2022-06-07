package DP;
// Minimum Number of Insertion & deletion required to convert String b to String a
public class MinInsertDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "heap";
		String b = "pea";
		// we have to delete "p"(1) & insert "hp"(2)
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
		
		System.out.println("Insertion : "+(a.length()-t[m][n]));
		System.out.println("Deletion : "+(b.length()-t[m][n]));
	}

}
