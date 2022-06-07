package DP;
import java.util.*;

public class EvaluateExpression_Memoization {
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "T^F&T";
		boolean evaluate = true;
		
		System.out.print(solve(s, 0, s.length()-1, evaluate));
	}
	static int solve(String s, int i, int j, boolean needed) {
		if(i>j) {
			return 0;
		}
		if(i==j) {
			if(needed) {
				return s.charAt(i)=='T'?1:0;
			}else {
				return s.charAt(i)=='F'?1:0;
			}
		}
		String st = i+" "+j+" "+needed;
		if(map.containsKey(st)) {
			return map.get(st);
		}
		int ans = 0;
		for(int k=i+1;k<j;k++) {
			int lt = solve(s,i,k-1,true);
			int lf = solve(s,i,k-1,false);
			int rt = solve(s,k+1,j,true);
			int rf = solve(s,k+1,j,false);
			
			if(s.charAt(k)=='^') {
				if(needed) {
					ans += lt*rf+lf*rt;
				}else {
					ans += lt*rt+lf*rf;
				}
			}
			else if(s.charAt(k) == '&') {
				if(needed) {
					ans+= lt*rt;
				}else {
					ans+= lf*rf+lt*rt+lf*rt;
				}
			}
			else if(s.charAt(k)=='|') {
				if(needed) {
					ans+= lt*rt+lf*rt+lt*rt;
				}
			}
		}
		map.put(st, ans);
		return ans;
	}
}
