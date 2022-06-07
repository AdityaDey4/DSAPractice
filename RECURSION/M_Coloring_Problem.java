package RECURSION;

import java.util.*;

public class M_Coloring_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<N;i++) {
			al.add(new ArrayList<Integer>());
			
		}
		addEdge(al,0,1);
		addEdge(al,1,2);
		addEdge(al,2,3);
		addEdge(al,3,1);
		
		int arr[]= new int[N];
		
		for(int i : arr) {
			arr[i]=0;
		}	
		System.out.print(" Is colored all the vertices : "+solveColoringProblem(0,al,arr,N));
	}
	static int color = 3;
	static boolean solveColoringProblem(int node,ArrayList<ArrayList<Integer>> al, int arr[], int N) {
		if(node == N) { 
			return true;
		}
		
		for(int i=1; i<=color ;i++) {
			
			if(isSafe(node,al,arr,i)) {
				
				arr[node]=i;
				if(solveColoringProblem(node+1,al,arr,N)) {
					return true;
				}
				arr[node]=0;
			}
		}
		return false;
	}
	
	static boolean isSafe(int node, ArrayList<ArrayList<Integer>> al, int arr[], int pos) {
		
		for(Integer it : al.get(node)) {
			if(arr[it]==pos) {
				return false;
			}
		}
		return true;
	}
	static void addEdge(ArrayList<ArrayList<Integer>> al , int i, int j) {
		al.get(i).add(j);
		al.get(j).add(i);
	}
}
