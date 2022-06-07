package RECURSION;

import java.util.*;
// This problem mainly solved by Dynamic Programming with very optimized way.
// This Solution is solved by Backtracking
public class WordBraek {

	public static void main(String[] args) {
		String name = "heaven";
		List<String> al = Arrays.asList("hea", "a","he","ven","e");
		int N = name.length();
		
		breakingWord(name, al, N);
	}
	static void breakingWord(String name, List<String> al, int N) {
		String ans ="";
		breakingWordUtil(name, al, N, ans);
	}
	static void breakingWordUtil(String name, List<String> al, int N, String ans) {
		
		for(int i=1; i<=N; i++) {
			
			String pre = name.substring(0, i);
			
			if(al.contains(pre)) {
				
				if(i == N) {
					ans+=pre;
					System.out.println(ans);
					return ;
				}
				breakingWordUtil(name.substring(i, N), al, N-i, ans+pre+" ");
			}
		}
	}
}
