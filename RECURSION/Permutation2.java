package RECURSION;

import java.util.*;

public class Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		printPermutations(0,arr.length,arr,al);
	}

	static void printPermutations(int index, int length, int[] arr, ArrayList<Integer> al) {
		
		if(index==length) {
			print(arr);
			return;
		}
		for(int i=index;i<length;i++) {
			swap(i,index,arr);  // for swap
			printPermutations(index+1,length,arr,al);
			swap(i,index,arr);  // again swap for actual array
		}
	}

	static void swap(int i, int index, int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
	}

	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
