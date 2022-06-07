package RECURSION;

import java.util.ArrayList;

public class Kth_Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4 , k=19;
		
		int arr[] = new int[N];
		
		for(int i=0; i<N ;i++) {
			arr[i]=i+1;
		}
		
		findKthPermutation(0, N, k, arr);
	}
	static void findKthPermutation(int index, int N, int k, int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int fac = 1;
		
		for(int i=0; i<N-1; i++) {
			
			fac = fac*arr[i];
			al.add(arr[i]);
		}
		al.add(arr[N-1]);
		k=k-1;
		N = N-1;
		
		while(true) {
			if(N == 0) {
				System.out.print(al.get(0));
				break;
			}
			
			int finalIndex = k/fac;
			System.out.print(al.get(finalIndex)+" ");
			al.remove(finalIndex);
			
			k = k%fac;
			fac = fac/N--;
		}
		
	}
}
