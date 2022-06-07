package RECURSION;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		Arrays.sort(arr);
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		uniqueSubsets(0,arr,al, ans);
		System.out.print(ans);
	}
	static void uniqueSubsets(int index, int[] arr, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(al));
        
        for(int i=index; i<arr.length; i++){
            if(i>index && arr[i] == arr[i-1]) continue;
            
            al.add(arr[i]);
            
            uniqueSubsets(i+1, arr, al, ans);
            al.remove(al.size()-1);
        }
    }

}
