package Sliding_Window;
// Longest Substring with K unique Characters

import java.util.*;
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabac";
		int k = 2; // no. of unique Character
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int i=0, j, max=0, ans=0;
		for(j=0; j<s.length(); j++) {
			char c = s.charAt(j);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			max++;
			if(map.size() == k) {
				ans = Math.max(ans, max);
			}
			else if(map.size() > k) {
				while(map.size() != k) {
					char del = s.charAt(i++);
					map.put(del, map.get(del)-1);
					if(map.get(del)==0) {
						map.remove(del);
					}
				}
				//max = max-i;
				//ans = Math.max(ans, max);
			}
		}
		System.out.print(ans);
	}
}
