package Searching_Sorting;

import java.util.*;
class Codechef {
	static ArrayList<Integer> al;
	public static void main(String[] args) {
		al = new ArrayList<>();
		int arr[][] = {{1,5,9}, {10,11,13}, {12,13,15}};
		kthSmallest(arr,8);
		//System.out.print(al);
		int i=0;
		String s = Integer.toString(i);
		System.out.print(s);
	}
    public static int kthSmallest(int[][] arr, int k) {
        int n = arr.length;
        int min = arr[0][0];
        int max = arr[n-1][n-1];
        
        while(min!=max){
            int mid = min+(max-min)/2;
            al.add(mid);
            int count = count(arr,mid);
            if(count<k){
                min = mid+1;
            }else{
                max = mid;
            }
        }
        return min;
    }
    public static int count(int[][] arr, int k){
        int c=0;
        int row = 0;
        int col = arr.length-1;
        while(row <arr.length && col>=0){
            if(arr[row][col] <= k){
                c+=col+1;
                row++;
            }else{
                col--;
            }
        }
        return c;
    }
}