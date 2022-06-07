package RECURSION;
//leetcode 39

import java.util.*;

public class CombinationSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sum = 8;
		
		combinationSum(0,arr.length,arr,al,sum);
	}
	static void combinationSum(int index, int length, int[] arr, ArrayList<Integer> al, int sum) {
		 if(sum == 0) {
			 System.out.println(al);
			 return;
		 }
		 if(index>=length || sum < 0) {
			 return;
		 }
		al.add(arr[index]);
		combinationSum(index,length,arr,al,sum-arr[index]);
		
		al.remove(al.size()-1);
		combinationSum(index+1,length,arr,al,sum);
	}
}
