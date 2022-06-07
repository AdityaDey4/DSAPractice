package GREEDY;

import java.util.Arrays;
import java.util.Comparator;

class MyJob{
	int profit;
	int deadline;
	MyJob(int p, int d){
		this.profit = p;
		this.deadline = d;
	}
}
public class Job_Sequencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] profit = {100, 19, 27, 25, 15};
		int[] deadline = {2, 1, 2, 1, 3};
		int time = 3;
		getMaxProfit(profit, deadline, time);
	}
	static void getMaxProfit(int[] profit, int[] deadline, int time) {
		MyJob jobs[] = new MyJob[profit.length];
		
		for(int i=0; i<profit.length; i++) {
			jobs[i] = new MyJob(profit[i], deadline[i]);
		}
		
		Arrays.sort(jobs, new Comparator<MyJob>() {

			@Override
			public int compare(MyJob o1, MyJob o2) {
				// TODO Auto-generated method stub
				if(o1.profit < o2.profit) {
					return 1;
				}
				if(o1.profit > o2.profit) {
					return -1;
				}
				return 0;
			}
			
		});
		boolean[] isFree = new boolean[time];
		int t_profit = 0;
		for(int i=0; i<jobs.length; i++) {
			int j = Math.min(time-1, jobs[i].deadline-1);
			for(;j>=0;j--) {
				if(isFree[j]==false) {
					isFree[j]=true;
					t_profit += jobs[i].profit;
					break;
				}
			}
		}
		
		System.out.print("Total Profit : "+t_profit);
	}
}
