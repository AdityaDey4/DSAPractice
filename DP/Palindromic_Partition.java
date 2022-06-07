package DP;

public class Palindromic_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		System.out.print(solve(0,s.length()-1, s));
	}
	static int solve(int i, int j, String s) {
		if(i>=j) {
			return 0;
		}
		if(isPalindrome(i,j,s)) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int temp = solve(i,k,s)+solve(k+1,j,s)+1;
			
			ans = Math.min(ans, temp);
		}
		return ans;
	}
	static boolean isPalindrome(int i, int j, String s) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
