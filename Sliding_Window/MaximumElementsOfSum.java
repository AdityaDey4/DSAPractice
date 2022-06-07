package Sliding_Window;
// Total of Maximum no. of elements that is equal to given sum;
public class MaximumElementsOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,1,1,2,3,5};
		int sum = 5;
		
		int ans = 0;
		int i=0, j=0, total = 0;
		
		for(; j<arr.length; j++) {
			total += arr[j];
			
			if(total > sum) {
				while(total > sum) {
					total -= arr[i++];
				}
			}
			if(total == sum) {
				ans = Math.max(ans, j-i+1);
			}
		}
		System.out.print("Maximum no. of elemnts equal to sum : "+ans);
	}

}
