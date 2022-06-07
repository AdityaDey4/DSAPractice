package RECURSION;

import java.util.*;

public class Kth_Permutation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4 , k=15;
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		int arr[] = new int[N];
		
		for(int i=0; i<N ;i++) {
			arr[i]=i+1;
		}
		
		findKthPermutation(0, N, arr, al);
		
		Collections.sort(al, new Comparator<ArrayList<Integer>>() {   // used to sort ArrayList of ArrayList

			@Override
			public int compare(ArrayList<Integer> curr1, ArrayList<Integer> curr2) {
				// TODO Auto-generated method stub
				for(int i=0; i<curr1.size(); i++) {
					if(curr1.get(i) > curr2.get(i)) {
						return 1;
					}
					else if(curr1.get(i) < curr2.get(i)) {
						return -1;
					}
				}
				return 0;
			}		
		});
		
		System.out.println(al.get(14));
				
		//System.out.println(al);
	}
	static void findKthPermutation(int index, int N, int[] arr, ArrayList<ArrayList<Integer>> al) {
		if(index==N) {
			addInArrayList(arr, al);
			return;
		}
		
		for(int i=index; i<N; i++) {
			swap(i, index, arr);
			findKthPermutation(index+1, N, arr, al);
			swap(i, index, arr);
		}
	}
	static void swap(int i, int index, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
	}
	static void addInArrayList(int[] arr, ArrayList<ArrayList<Integer>> al) {
		
		ArrayList<Integer> curr = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length;i++) {
			curr.add(arr[i]);
		}
		al.add(new ArrayList<Integer>(curr));
	}
}
