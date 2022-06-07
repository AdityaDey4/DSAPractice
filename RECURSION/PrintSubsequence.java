package RECURSION;

import java.util.*;

public class PrintSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		subsequence(0,arr.length,arr,al);
	}
	static void subsequence(int i, int length, int[] arr, ArrayList<Integer> al) {
		if(i>=length) {
			System.out.println(al);
			return;
		}
		al.add(arr[i]);
		subsequence(i+1,length,arr,al);
		al.remove(al.size()-1);
		subsequence(i+1,length,arr,al);
	}
}
