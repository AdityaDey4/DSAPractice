package DP;

import java.util.Arrays;

public class Palindromic_Partition_Memoization2 {
	static int[][] t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new int[101][101];
		for(int[] it : t) {
			Arrays.fill(it, -1);
		}
		String s = "abbaaab";
		System.out.print(solve(0,s.length()-1, s));
	}
	static int solve(int i, int j, String s) {
		if(i>=j) {
			return t[i][j] = 0;
		}
		if(isPalindrome(i,j,s)) {
			return t[i][j] = 0;
		}
		
		int ans = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int left = 0, right = 0;
			if(t[i][k] != -1) {
				left = t[i][k];
			}else {
				left = solve(i,k,s);
			}
			
			if(t[k+1][j] != -1) {
				right = t[k+1][j];
			}else {
				right = solve(k+1,j,s);
			}
			
			int temp = left+right+1;
			
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
