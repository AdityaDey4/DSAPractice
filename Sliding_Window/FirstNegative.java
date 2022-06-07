package Sliding_Window;
import java.util.*;
public class FirstNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, -7, -8, 10, -9, 30, 15, 1};
		int k = 3;
		Queue<Integer> neg = new LinkedList<Integer>();
		for(int i=0; i< k; i++) {
			if(arr[i] < 0) {
				neg.add(arr[i]);
			}
		}
		if(neg.size() == 0) {
			System.out.print(0+" ");
		}else {
			if(arr[0] == neg.peek()) {
				System.out.print(neg.poll()+" ");
			}else {
				System.out.print(neg.peek()+" ");
			}
		}
		int i=1;
		for(int j=k; j<arr.length; j++) {
			if(arr[j] < 0) {
				neg.add(arr[j]);
			}
			
			if(neg.size() == 0) {
				System.out.print(0+" ");
			}else {
				if(arr[i] == neg.peek()) {
					System.out.print(neg.poll()+" ");
				}else {
					System.out.print(neg.peek()+" ");
				}
			}
			i++;
			
		}
	}

}
