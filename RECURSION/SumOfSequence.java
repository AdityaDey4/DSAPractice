package RECURSION;

import java.util.ArrayList;

public class SumOfSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,2};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sum = 2;
		
		int sumSequence = subsequence(0,arr.length,arr,al,sum);
		System.out.println("Total no. of Sequence that equals to sum is : "+sumSequence);
	}
	static int subsequence(int i, int length, int[] arr, ArrayList<Integer> al, int sum) {
		if(i>=length) {
			int total = totalSum(al);
			if(total == sum) {
				System.out.println(al);
				return 1;
			}
			return 0;
		}
		al.add(arr[i]);
		int plus = subsequence(i+1,length,arr,al,sum);
		al.remove(al.size()-1);
		int minus = subsequence(i+1,length,arr,al,sum);
		return plus+minus;
	}
	static int totalSum(ArrayList<Integer> al) {
		int sum=0;
		for(int i:al) {
			sum=sum+i;
		}
		return sum;
	}
}
