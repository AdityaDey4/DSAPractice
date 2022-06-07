package GREEDY;

import java.util.*;

class Pair{
	int start;
	int finish;
	Pair(int s, int f){
		this.start = s;
		this.finish = f;
	}
}
public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[] = {5, 1, 3, 0, 5, 8};
		int finish[] = {9, 2, 4, 6, 7, 9};
		
		int ans = maximumActivitySelection(start, finish);
		System.out.print("Maximum Activity Done : "+ans);
	}
	static int maximumActivitySelection(int[] start, int[] finish) {
		Pair[] pair = new Pair[start.length];
		int res = 1;
		for(int i=0; i<start.length;i++) {
			pair[i] = new Pair(start[i], finish[i]);
		}
		Arrays.sort(pair, new Comparator<Pair>(){

			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.finish > o2.finish) {
					return 1;
				}
				if(o1.finish < o2.finish) {
					return -1;
				}
				if(o1.start > o2.start) {
					return 1;
				}
				if(o1.start < o2.start) {
					return -1;
				}
				return 0;
			}
			
		});
		int i= 0;
		System.out.println(pair[i].start+" -> "+pair[i].finish);
		for(int j=1; j<pair.length; j++) {
			if(pair[j].start >= pair[i].finish) {
				System.out.println(pair[j].start+" -> "+pair[j].finish);
				i=j;
				j++;
				res++;
			}
		}
		return res;
	}
}
