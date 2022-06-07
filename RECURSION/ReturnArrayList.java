package RECURSION;
import java.util.*;
public class ReturnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,3,3,4,5};
		int data = 3;
		ArrayList<Integer> al = arrayList(arr,arr.length-1,data);
		if(al.size()==0) {
			System.out.print(data+" not found in the array");
		}else {
			System.out.print("Positions of "+data+" in array : "+al);
		}
	}
	static ArrayList<Integer> arrayList(int[] arr, int l, int data){
		if(l==-1) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> al = arrayList(arr,l-1,data);
		if(arr[l]==data) {
			al.add(l);
		}
		return al;
	}
}
