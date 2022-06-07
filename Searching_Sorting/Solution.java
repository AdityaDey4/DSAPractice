package Searching_Sorting;

import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {
		countHillValley(new int[] {8,2,5,7,7,2,10,3,6,2});
	}
    public static void countHillValley(int[] arr) {
       
    	
        int n = arr.length-1;
        for(int i=1; i<=n-1; i++){
            int f=i-1;
            int l = i+1;
            while(f!=-1 && arr[f] == arr[i]){
                f--;
            }
            while(l!=n+1 && arr[l] == arr[i]){
                l++;
            }
            if (l != i+1) continue;
            if(f>=0 && l<=n){
                if(arr[l]> arr[i] && arr[f]> arr[i]){
                	System.out.print(arr[i]+" ");
                }
                else if(arr[l]<arr[i] && arr[f]<arr[i]){
                	System.out.print(arr[i]+" ");
                }
            }
        }
        
       
    }
}
