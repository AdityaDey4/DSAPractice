package DP;
// print shortest common super_sequence
public class Print_SCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "geek";
		String b = "eke";
		
		int m = a.length();
		int n = b.length();
		int[][] t = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)) {
					t[i][j] = 1+t[i-1][j-1];
				}else {
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		StringBuilder s = new StringBuilder();
		while(m!=0 && n!=0) {
			if(a.charAt(m-1) == b.charAt(n-1)) {
				s.append(a.charAt(m-1));
				m--;
				n--;
			}
			else if(t[m-1][n] > t[m][n-1]) {
				s.append(a.charAt(m-1));
				m--;
			}else {
				s.append(b.charAt(n-1));
				n--;
			}
		}
		while(m!=0) {
			s.append(a.charAt(m-1));
			m--;
		}
		while(n!=0) {
			s.append(b.charAt(n-1));
			n--;
		}
		System.out.print(s.reverse());
	}

}
