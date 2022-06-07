package RECURSION;

import java.util.*;

public class Palindromic_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "aabb";
        ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
        ArrayList<String> curr = new ArrayList<String>();
        
        findPatitions(0, s.length(), s, curr, al);
        printPatitions(al);
	}
	static void printPatitions(ArrayList<ArrayList<String>> al) {
		for(ArrayList<String> curr : al) {
			System.out.println(curr);
		}
	}
	static void findPatitions(int index, int length, String s, ArrayList<String> curr, ArrayList<ArrayList<String>> al){
		
		if(index == length) {
			al.add(new ArrayList<String>(curr));
			return;
		}
		
		for(int i=index; i<length; i++) {
			
			if(isPalindrome(index, i, s)) {
				curr.add(s.substring(index, i+1)); // i+1 because of total length
				findPatitions(i+1, length, s, curr, al);
				curr.remove(curr.size()-1);
			}
		}
	}
	static boolean isPalindrome(int start, int end, String s) {
		
		while(start <= end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
