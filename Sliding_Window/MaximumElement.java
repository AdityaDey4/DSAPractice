package Sliding_Window;
// Maximum Element in every window

import java.util.*;
public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, -7, 4, -9, 10, 5};
		int k = 3;
		// not execute for duplicate elements
		Queue<Integer> al = new LinkedList<Integer>();
		int i=0, j=0;
		al.add(arr[j++]);
		for(; j<k; j++) {
			if(arr[j] > al.peek()) {
				arrangeElements(al, arr[j]);
			}
			al.add(arr[j]);
		}
		System.out.print(al.peek()+" ");
		for(; j<arr.length; j++) {
			if(arr[i++]==al.peek()) {
				al.poll();
			}
			if(arr[j] > al.peek()) {
				arrangeElements(al, arr[j]);
			}
			al.add(arr[j]);
			System.out.print(al.peek()+" ");
		}
	}
	static void arrangeElements(Queue<Integer> al, int ele) {
		while(! al.isEmpty()) {
			if(al.peek() <= ele) {
				al.poll();
			}
		}
	}
}
