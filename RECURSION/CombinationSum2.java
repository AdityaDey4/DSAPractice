package RECURSION;
// leetcode 40

import java.util.*;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,3};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sum = 4;
		Arrays.sort(arr);
		
		combinationSum2(0,arr.length,arr,al,sum);
	}
	static void combinationSum2(int index, int length, int[] arr, ArrayList<Integer> al, int sum) {
		//we can solve this problem through hashset 
		if(sum == 0) {
			 System.out.println(al);
			 return;
		 }
		
		if(index>=length || sum < 0) {
			 return;
		 }
		 
		for(int i=index; i<arr.length;i++) {
			if(i>index && arr[i]==arr[i-1]) {
				continue;
			}
			al.add(arr[i]);
			combinationSum2(i+1,length,arr,al,sum-arr[i]);
			al.remove(al.size()-1);
		}
	}
}
