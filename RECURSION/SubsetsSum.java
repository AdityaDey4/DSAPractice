package RECURSION;

import java.util.ArrayList;

public class SubsetsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sum = 0;
		
		allSubsetsSum(0,arr.length,arr,al,sum);
	}
	static void allSubsetsSum(int index, int length, int[] arr, ArrayList<Integer> al, int sum) {
		if(index>=length) {
			System.out.println(al+" -> "+sum);
			return;
		 }
		
		al.add(arr[index]);
		allSubsetsSum(index+1,length,arr,al,sum+arr[index]);
		
		al.remove(al.size()-1);
		allSubsetsSum(index+1,length,arr,al,sum);
	}
}
