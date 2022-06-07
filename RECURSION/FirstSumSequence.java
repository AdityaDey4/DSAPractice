package RECURSION;

import java.util.ArrayList;

public class FirstSumSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sum = 2;
		
		subsequence(0,arr.length,arr,al,sum);
	}
	static boolean subsequence(int i, int length, int[] arr, ArrayList<Integer> al, int sum) {
		if(i>=length) {
			int total = totalSum(al);
			if(total == sum) {
				System.out.println(al);
				return true;
			}
			return false;
		}
		al.add(arr[i]);
		if(subsequence(i+1,length,arr,al,sum)==true) {
			return true;
		}
		al.remove(al.size()-1);
		if(subsequence(i+1,length,arr,al,sum)==true) {
			return true;
		}
		return false;
	}
	static int totalSum(ArrayList<Integer> al) {
		int sum=0;
		for(int i:al) {
			sum=sum+i;
		}
		return sum;
	}
}
