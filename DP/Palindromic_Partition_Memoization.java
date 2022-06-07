package DP;

import java.util.Arrays;

public class Palindromic_Partition_Memoization {
	static int[][] t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new int[101][101];
		for(int[] it : t) {
			Arrays.fill(it, -1);
		}
		String s = "nitish";
		System.out.print(solve(0,s.length()-1, s));
	}
	static int solve(int i, int j, String s) {
		if(i>=j) {
			return t[i][j] = 0;
		}
		if(isPalindrome(i,j,s)) {
			return t[i][j] = 0;
		}
		if(t[i][j] != -1) {
			return t[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int temp = solve(i,k,s)+solve(k+1,j,s)+1;
			
			ans = Math.min(ans, temp);
		}
		return t[i][j] = ans;
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
