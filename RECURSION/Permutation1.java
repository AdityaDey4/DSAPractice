package RECURSION;
// Approach 1 with extra space

import java.util.*;

public class Permutation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		ArrayList<Integer> al = new ArrayList<Integer>();
		boolean[] visited = new boolean[arr.length];
		
		printPermutations(0,arr.length,arr,al,visited);
	}

	static void printPermutations(int index, int length, int[] arr, ArrayList<Integer> al, boolean[] visited) {
		
		if(al.size()==length) {
			System.out.println(al);
			return;
		}
		
		for(int i=0;i<length;i++) {
			if(visited[i]==false) {
				al.add(arr[i]);
				visited[i]=true;
				printPermutations(i+1,length,arr,al,visited);
				
				al.remove(al.size()-1); // BACKTRACKING
				visited[i]=false; // BACKTRACKING
			}
		}
		
	}

}
