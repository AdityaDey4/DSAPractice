package Sliding_Window;
import java.util.*;
public class OccurenceOfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabaabaa";
		String p = "aaab"; // anagram means partitions
		// here k = size of pattern
		int k = p.length();
		int ans = 0, i=0, j=0;
		int ASCII = 256;
		int[] s_arr = new int[ASCII];
		int[] p_arr = new int[ASCII];
		
		for(; j<k; j++) {
			s_arr[s.charAt(j)] += 1;
			p_arr[p.charAt(j)] += 1;
		}
		
		if(Arrays.equals(s_arr, p_arr)) {
			ans++;
		}
		
		for(; j<s.length(); j++) {
			s_arr[s.charAt(i++)] -= 1;
			s_arr[s.charAt(j)] += 1;
			
			if(Arrays.equals(s_arr, p_arr)) {
				ans++;
			}
		}
		System.out.print(ans);
	}

}
