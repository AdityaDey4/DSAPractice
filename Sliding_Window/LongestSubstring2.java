package Sliding_Window;
//Longest Substring without repeating character

import java.util.*;
public class LongestSubstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwiwkew";
		int i=0, j, flag=0, ans=0;
		boolean isEnd = false;
		
		List<Character> al = new ArrayList<Character>();
		for(j=0; j<s.length(); j++) {
			char c = s.charAt(j);
			if(! al.contains(c)) {
				al.add(c);
				isEnd = true;

			}else {
				while(!al.get(0).equals(c)) {
					al.remove(0);
					i++;
				}
				al.remove(0);
				i++;
				ans= Math.max(ans, j-flag);
				flag = i;
				isEnd = false;
				al.add(c);
			}
		}
		if(isEnd) {
			ans = Math.max(j-flag, ans);
		}
		System.out.print(ans);
	}

}
